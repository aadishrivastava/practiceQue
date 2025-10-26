package dev.lpa;

import java.util.Scanner;

public class Main253 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int a = sc.nextInt(), b = sc.nextInt();
            int c = sc.nextInt(), d = sc.nextInt();

            int r2 = c - a, k2 = d - b;

            if (valid(a, b) && valid(r2, k2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
    static boolean valid(int x, int y) {
        return Math.max(x, y) <= 2 * Math.min(x, y) + 2;
    }
}
