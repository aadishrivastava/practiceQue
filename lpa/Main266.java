package dev.lpa;

import java.util.Scanner;

public class Main266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }
            long x = sc.nextLong();
            System.out.println(aadiSolves(arr, x, n));
        }
    }

    public static String aadiSolves(long[] a, long x, int n) {
        long low = a[0];
        long high = a[0];

        for (int i = 1; i < n; i++) {
            long newLow = Math.min(low, a[i]);
            long newHigh = Math.max(high, a[i]);

            low = newLow;
            high = newHigh;

            if (low > high) {
                return "NO";
            }
        }

        return (x >= low && x <= high) ? "YES" : "NO";
    }
}
