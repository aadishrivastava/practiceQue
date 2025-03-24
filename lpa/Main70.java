package dev.lpa;

import java.util.*;

public class Main70 {

    static class Grid {
        int Row, Column, Time, Strength;

        Grid(int row, int col, int time, int strength) {
            this.Row = row;
            this.Column = col;
            this.Time = time;
            this.Strength = strength;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] sharks = new int[n][m];
        int startRow = -1, startColumn = -1, DestinationRow = -1, DestinationColumn = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                String input = sc.next();
                if (input.equals("S")) {
                    startRow = i;
                    startColumn = j;
                    sharks[i][j] = 0;
                } else if (input.equals("D")) {
                    DestinationRow = i;
                    DestinationColumn = j;
                    sharks[i][j] = 0;
                } else {
                    sharks[i][j] = Integer.parseInt(input);
                }
            }
        }

        int[][] time = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                time[i][j] = sc.nextInt();
            }
        }

        int[] downRow = {-1, 1, 0, 0};
        int[] downCol = {0, 0, -1, 1};
        int initStrength = sc.nextInt();


        PriorityQueue<Grid> PQ = new PriorityQueue<>((a, b) -> a.Time - b.Time);
        PQ.add(new Grid(startRow, startColumn, 0, initStrength));

        int[][] maximumStrength = new int[n][m];
        for (int[] row : maximumStrength) Arrays.fill(row, -1);
        maximumStrength[startRow][startColumn] = initStrength;

        while (!PQ.isEmpty()) {
            Grid curr = PQ.poll();

            if (curr.Row == DestinationRow && curr.Column == DestinationColumn) {
                System.out.println(curr.Time + " " + curr.Strength);
                return;
            }

            for (int d = 0; d < 4; d++) {
                int newRow = curr.Row + downRow[d];
                int newCol = curr.Column + downCol[d];

                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m) {
                    int newStrength = curr.Strength - 1 - sharks[newRow][newCol];
                    int newTime = curr.Time + time[newRow][newCol];
                    if (newStrength >= 0 && newStrength > maximumStrength[newRow][newCol]) {
                        maximumStrength[newRow][newCol] = newStrength;
                        PQ.add(new Grid(newRow, newCol, newTime, newStrength));
                    }
                }
            }
        }
        System.out.println("Not Possible");
    }
}

