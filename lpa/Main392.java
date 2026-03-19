package dev.lpa;

import java.util.Scanner;

public class Main392 {
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
    public static void AadiSolves(int n,int[] arr){
        int maxIdx=0;
        int max=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIdx=i;
            }
        }
        if(maxIdx!=0){
            int temp=arr[0];
            arr[0]=arr[maxIdx];
            arr[maxIdx]=temp;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
