package dev.lpa;

import java.util.Scanner;

public class Main334 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            if (arr[0]==-1 && arr[n-1]==-1){
                arr[0]=arr[n-1]=0;
            }else if(arr[0]==-1){
                arr[0]=arr[n-1];
            } else if ( arr[n-1] == -1) {
                arr[n-1]=arr[0];
            }
            System.out.println(Math.abs(arr[n-1]-arr[0]));
            for (int i = 0; i < n; i++) {
                if(arr[i]==-1){
                    arr[i]=0;
                }
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
