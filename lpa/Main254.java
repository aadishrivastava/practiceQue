package dev.lpa;

import java.util.Scanner;

public class Main254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();


            int[] idx = new int[n + 1];
            for (int i = 0; i < n; i++)
                idx[p[i]] = i;

            boolean possible = true;
            int min = idx[1], max = idx[1];

            for (int k = 2; k <= n; k++) {
                min = Math.min(min, idx[k]);
                max = Math.max(max, idx[k]);
                if (max - min + 1 != k) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
            }
    }
}
