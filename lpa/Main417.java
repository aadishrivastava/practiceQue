package dev.lpa;

import java.util.Scanner;

public class Main417 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            AadiSolves(n);
        }
    }
    public static void AadiSolves(int n){
        for (int i = 1; i <= n; i++) {
            int x=2*i;
            System.out.print(i + " " + (n+x-1)+" "+(n+x)+" ");
        }
        System.out.println();
    }

}
