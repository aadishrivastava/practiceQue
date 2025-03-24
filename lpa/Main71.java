package dev.lpa;

import java.util.*;

public class Main71{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of dots
        List<int[]> points = new ArrayList<>();

        // Read the coordinates of the dots
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new int[]{x, y});
        }

        // Sort points lexicographically by x-coordinate, then by y-coordinate
        points.sort((a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        // Build the lower hull
        List<int[]> lowerHull = new ArrayList<>();
        for (int[] point : points) {
            while (lowerHull.size() >= 2 && crossProduct(lowerHull.get(lowerHull.size() - 2), lowerHull.get(lowerHull.size() - 1), point) <= 0) {
                lowerHull.remove(lowerHull.size() - 1);
            }
            lowerHull.add(point);
        }

        // Calculate the perimeter of the bowl
        double perimeter = 0.0;
        for (int i = 1; i < lowerHull.size(); i++) {
            perimeter += distance(lowerHull.get(i - 1), lowerHull.get(i));
        }

        // Output the rounded perimeter
        System.out.println((int) Math.round(perimeter));
    }

    // Cross product to determine the orientation of three points
    private static int crossProduct(int[] o, int[] a, int[] b) {
        return (a[0] - o[0]) * (b[1] - o[1]) - (a[1] - o[1]) * (b[0] - o[0]);
    }

    // Calculate the Euclidean distance between two points
    private static double distance(int[] p1, int[] p2) {
        return Math.sqrt(Math.pow(p1[0] - p2[0], 2) + Math.pow(p1[1] - p2[1], 2));
    }
}
