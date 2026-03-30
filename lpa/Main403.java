package dev.lpa;

import java.util.Scanner;

public class Main403 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            AadiSolves(n);
        }
    }
    public static void AadiSolves(int n){
        if(n==1){
            System.out.println(1);
        }else{
            for (int i = 0; i < n; i++) {
                System.out.print(2+" ");
            }
            System.out.println();
        }
    }
}
