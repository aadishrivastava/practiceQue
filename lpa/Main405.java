package dev.lpa;

import java.util.Scanner;

public class Main405 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();

            }
            AadiSolves(n,arr);

        }
    }
    public static void AadiSolves(int n, int[] arr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIdx=0,maxIdx=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIdx=i;
            }
            if (arr[i]<min) {
                min=arr[i];
                minIdx=i;
            }
        }
        int left=Math.max(minIdx,maxIdx)+1;
        int right=n-Math.min(minIdx,maxIdx);
        int between = (Math.min(minIdx, maxIdx) + 1) + (n - Math.max(minIdx, maxIdx));

        System.out.println(Math.min(between,Math.min(left,right)));
    }
}
