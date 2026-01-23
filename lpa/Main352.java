package dev.lpa;

import java.util.*;

public class Main352 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0) {
            int n=sc.nextInt();
            int h=sc.nextInt();
            int l=sc.nextInt();

            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(AadiSolves(n,h,l,arr));
        }
    }
    public static int AadiSolves(int n, int h, int l,int[] arr){
        int row=0;
        int column=0;
        int breakThrough=0;
        int min=Math.min(h, l);

        for(int i = 0; i < n; i++){
            if(arr[i]<=min){
                breakThrough++;
            }else if(arr[i]<=h){
                row++;
            }else if(arr[i]<=l){
                column++;
            }
        }

        return Math.min(Math.min(row+breakThrough, column+breakThrough), (row+column+breakThrough)/2);
    }
}
