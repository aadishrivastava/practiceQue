package dev.lpa;

import java.util.Scanner;

public class Main289 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int max=0,secondMax=0;
        for (int i = 0; i < n; i++) {
            max= Math.max(arr[i],max);
        }
        for (int i = 0; i < n; i++) {
            if(max>arr[i]){
                secondMax=Math.max(secondMax,arr[i]);
            }
        }
        if(secondMax==0 || secondMax==max){
            System.out.println(-1);
        }else{
            System.out.println(secondMax);
        }
    }
}
