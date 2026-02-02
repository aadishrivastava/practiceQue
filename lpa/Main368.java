package dev.lpa;

import java.util.Scanner;

public class Main368 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(AadiSolves(arr));
        }
    }
    public static int AadiSolves(int[] arr){
        int operations=0;
        for (int i = 0; i < arr.length - 1; i++) {
            int parity1=arr[i]%2;
            int parity2=arr[i+1]%2;
            if(parity2==parity1){
                operations++;
            }
        }
        return operations;
    }
}
