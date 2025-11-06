package dev.lpa;

import java.util.Scanner;

public class Main267 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextLong();
            }
            System.out.println(aadiSolves(arr,n));
        }
    }

    public static String aadiSolves(long[] a,int n){
        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((a[j] % a[i]) % 2 == 0) {
                    return a[i]+" "+a[j];
                }
            }
        }
        return "-1";

    }
}
