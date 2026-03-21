package dev.lpa;

import java.util.Scanner;

public class Main395 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            AadiSolves(a);
        }
    }
    public static void AadiSolves(int[] a){
        for (int i :a) {
            if(i==67){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");

    }
}
