package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main298 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[n - 1] < 1) {
            System.out.println(1);
            return;
        }
        for (int i = 0; i < n-1; i++) {
            if(arr[i]<=0){
                continue;
            }
            if(arr[i+1]-arr[i]!=1){
                System.out.println(arr[i]+1);
                return;
            }
        }
        System.out.println(arr[arr.length-1]+1);
    }
}
