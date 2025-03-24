package dev.lpa;

import java.util.*;

public class Main91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        StringBuilder result = new StringBuilder();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int b = scanner.nextInt();
            int[] transformed = new int[n];
            for (int i = 0; i < n; i++) {
                transformed[i] = b - a[i];
            }
            if (canSort(a, transformed)) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }
        scanner.close();
        System.out.print(result);
    }


    private static boolean canSort(int[] original, int[] transformed) {
        int n = original.length;
        int[] possible = new int[n];

        possible[0] = Math.min(original[0], transformed[0]);
        for (int i = 1; i < n; i++) {

            if (original[i] >= possible[i - 1] && transformed[i] >= possible[i - 1]) {
                possible[i] = Math.min(original[i], transformed[i]);
            } else if (original[i] >= possible[i - 1]) {
                possible[i] = original[i];
            } else if (transformed[i] >= possible[i - 1]) {
                possible[i] = transformed[i];
            } else {
                return false;
            }
        }
        return true;
    }


}
