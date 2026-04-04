package dev.lpa;

import java.util.*;

public class Main418 {
    public static int lastPrime = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            AadiSolves(n);
        }
    }
    public static void AadiSolves(int n) {
        lastPrime = 1;
        int firstPrime = nextPrime();
        System.out.print(1 + " ");
        if (n >= 2) System.out.print(firstPrime + " ");
        for (int i = 2; i < n; i++) {
            int secondPrime = nextPrime();
            System.out.print((long) firstPrime * secondPrime + " ");
            firstPrime = secondPrime;
        }
        System.out.println();
    }
    public static int nextPrime() {
        int num=lastPrime + 1;
        while (true) {
            boolean prime=true;
            for (int i=2;i*i<=num;i++) {
                if (num%i==0) {
                    prime=false;
                    break;
                }
            }
            if (prime) {
                lastPrime = num;
                return num;
            }
            num++;
        }
    }
}
