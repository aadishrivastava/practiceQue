package dev.lpa;

import java.util.Scanner;

public class Main366 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();

            }
            System.out.println(AadiSolves(n,arr));
        }
    }
    public static int AadiSolves(int n,int[] arr){
        long sum = 0;
        for (int x : arr) {
            sum += x;
        }
        if (sum == n) {
            return 0;
        }
        if (sum < n) {
            return 1;
        }
        return (int)(sum - n);
    }
}
