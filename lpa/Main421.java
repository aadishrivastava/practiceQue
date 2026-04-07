package dev.lpa;

import java.util.*;

public class Main421 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();
            AadiSolves(n,m,a,b);
        }
    }
    public static void AadiSolves(long n, long m, long a, long b){
        long xAxis = a, yAxis = n;
        while (yAxis != 0) {
            long temp = yAxis;
            yAxis = xAxis % yAxis;
            xAxis = temp;
        }
        long gcdOfAN = xAxis;
        xAxis = b; yAxis = m;
        while (yAxis != 0) {
            long temp = yAxis;
            yAxis = xAxis % yAxis;
            xAxis = temp;
        }
        long gcdOfBM = xAxis;
        xAxis = n; yAxis = m;
        while (yAxis != 0) {
            long temp = yAxis;
            yAxis = xAxis % yAxis;
            xAxis = temp;
        }
        long gcdOfNM = xAxis;
        if (gcdOfAN != 1 || gcdOfBM != 1) {
            System.out.println("NO");
        } else if (gcdOfNM == 1) {
            System.out.println("YES");
        } else if (n == 2 && m == 2 && a % 2 == 1 && b % 2 == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

