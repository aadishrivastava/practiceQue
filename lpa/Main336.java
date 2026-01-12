package dev.lpa;

import java.util.Scanner;

public class Main336 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long k=sc.nextLong();
            Aadisolves(n,k);

        }
    }
    public static void Aadisolves(long n, long k) {
        if (k > n) {
            System.out.println(-1);
            return;
        }
        long steps = 0;
        long low = n;
        long high = n;

        while (low > 0) {
            if (k >= low && k <= high) {
                System.out.println(steps);
                return;
            }
            low = low / 2;
            high = (high + 1) / 2;
            steps++;
        }
        System.out.println(-1);
    }
}
