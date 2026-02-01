package dev.lpa;

import java.util.Scanner;

public class Main364 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(AadiSolves(n,arr));
        }
    }
    public static int AadiSolves(int n, int[] arr){
        int neg=0,pos=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                pos++;
            }else {
                neg++;
            }
        }
        int ops = 0;
        if (neg % 2 != 0) {
            ops++;
            neg--;
            pos++;
        }
        while (pos < neg) {
            ops += 2;
            neg -= 2;
            pos += 2;
        }
        return ops;
    }
}
