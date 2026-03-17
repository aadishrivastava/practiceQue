package dev.lpa;

import java.util.Scanner;

public class Main382 {
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
        int result=0;
        for (int i = 0; i < n; i++) {
            result^=arr[i];
        }
        System.out.println(n%2!=0?result:result==0?0:-1);
    }
}
