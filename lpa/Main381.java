package dev.lpa;

import java.util.Scanner;

public class Main381 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            AadiSolves(n,arr);
        }
    }
    public static void AadiSolves(int n, int[] arr){
        for (int i = 1; i < n; i++) {
            if(Math.abs(arr[i]-arr[i-1])!=5 && Math.abs(arr[i]-arr[i-1])!=7){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
