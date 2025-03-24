package dev.lpa;

import java.util.Scanner;

public class Main104 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            int min = n * (-p);
            int max = n * p;

            if (k < min || k > max) {
                System.out.println(-1);
                continue;
            }

            int operations = 0;
            int abs = Math.abs(k);

            operations = (abs + p - 1) / p;

            if (operations > n) {
                System.out.println(-1);
            } else {
                System.out.println(operations);
            }

        }
    }
}
