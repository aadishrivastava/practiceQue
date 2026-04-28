package dev.lpa;

import java.util.Scanner;

public class Main439 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int MOD=676767677;
            int sum=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]!=1){
                    sum+=arr[i];
                }
            }
            if(arr[n-1]==1){
                sum++;
            }
            System.out.println(sum%MOD);
        }
    }
}
