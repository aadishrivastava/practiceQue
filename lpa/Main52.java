package dev.lpa;

import java.util.Scanner;

public class Main52 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            // Read number of test cases
            int t = scanner.nextInt();

            while (t-- > 0) {
                // Read the length of the array
                int n = scanner.nextInt();
                long[] a = new long[n];

                // Read the array elements
                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextLong();
                }

                // Calculate maximum possible length of the array
                System.out.println(maxLength(n, a));
            }

            scanner.close();
        }

    private static int maxLength(int n, long[] a) {
        // To store the maximum length of the array after operations
        int maxLength = n;

        // Use a set to keep track of the valid indices
        boolean[] seen = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            long ai = a[i - 1];
            int expectedIndex = (int)(n + 1 - i);
            if (ai == expectedIndex && !seen[i]) {
                // Mark the index as seen
                seen[i] = true;
                // Append i - 1 zeros
                maxLength += (i - 1);
            }
        }

        return maxLength;
    }






}
