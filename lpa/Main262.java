package dev.lpa;

import java.util.Scanner;

public class Main262 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int max=Integer.MIN_VALUE;
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
