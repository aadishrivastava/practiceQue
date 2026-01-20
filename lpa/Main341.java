package dev.lpa;

import java.util.Scanner;

public class Main341 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(AadiSolves(arr));
        }
    }
    public static int AadiSolves(int[] arr){
        int max=0;
        for (int j : arr) {
            max = Math.max(max, j);
        }
        return max*arr.length;
    }
}
