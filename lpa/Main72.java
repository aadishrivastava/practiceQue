package dev.lpa;
import java.util.Scanner;

public class Main72 {
    private static char[][][] cube;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();  // Consume the leftover newline

        cube = new char[6][n][n];

        // Read the cube faces
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < n; j++) {
                String[] line = scanner.nextLine().split(" ");
                for (int l = 0; l < n; l++) {
                    cube[i][j][l] = line[l].charAt(0);
                }
            }
        }

        // Process rotations
        for (int i = 0; i < k; i++) {
            String rotation = scanner.nextLine();
            switch (rotation) {
                case "turn left":
                    turnLeft(n);
                    break;
                case "turn right":
                    turnRight(n);
                    break;
                case "rotate front":
                    rotateFront(n);
                    break;
                case "rotate back":
                    rotateBack(n);
                    break;
                case "rotate left":
                    rotateLeft(n);
                    break;
                case "rotate right":
                    rotateRight(n);
                    break;
            }
        }

        // Read the final query
        String[] query = scanner.nextLine().split(" ");
        String side = query[0];
        int row = Integer.parseInt(query[1]) - 1;
        int col = Integer.parseInt(query[2]) - 1;

        // Determine the side index
        int sideIndex = 0;
        switch (side) {
            case "base":
                sideIndex = 0;
                break;
            case "back":
                sideIndex = 1;
                break;
            case "top":
                sideIndex = 2;
                break;
            case "front":
                sideIndex = 3;
                break;
            case "left":
                sideIndex = 4;
                break;
            case "right":
                sideIndex = 5;
                break;
        }

        // Ensure row and col are within bounds
        if (row >= 0 && row < n && col >= 0 && col < n) {
            System.out.println(cube[sideIndex][row][col]);
        } else {
            System.out.println("Invalid position!");
        }
    }

    private static void turnLeft(int n) {
        rotateSides(new int[]{3, 4, 1, 5});
        rotateFaceLeft(2, n);
        rotateFaceRight(0, n);
    }

    private static void turnRight(int n) {
        rotateSides(new int[]{3, 5, 1, 4});
        rotateFaceRight(2, n);
        rotateFaceLeft(0, n);
    }

    private static void rotateFront(int n) {
        rotateSides(new int[]{0, 1, 2, 3});
        rotateFaceRight(4, n);
        rotateFaceLeft(5, n);
    }

    private static void rotateBack(int n) {
        rotateSides(new int[]{0, 3, 2, 1});
        rotateFaceLeft(4, n);
        rotateFaceRight(5, n);
    }

    private static void rotateLeft(int n) {
        rotateSides(new int[]{2, 4, 0, 5});
        rotateFaceLeft(3, n);
        rotateFaceRight(1, n);
    }

    private static void rotateRight(int n) {
        rotateSides(new int[]{2, 5, 0, 4});
        rotateFaceRight(3, n);
        rotateFaceLeft(1, n);
    }

    private static void rotateSides(int[] sides) {
        char[][] temp = cube[sides[0]];
        cube[sides[0]] = cube[sides[1]];
        cube[sides[1]] = cube[sides[2]];
        cube[sides[2]] = cube[sides[3]];
        cube[sides[3]] = temp;
    }

    private static void rotateFaceLeft(int face, int n) {
        char[][] temp = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = cube[face][j][n - 1 - i];
            }
        }
        cube[face] = temp;
    }

    private static void rotateFaceRight(int face, int n) {
        char[][] temp = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = cube[face][n - 1 - j][i];
            }
        }
        cube[face] = temp;
    }
}
