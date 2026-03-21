package dev.lpa;

import java.util.Scanner;

public class Main394 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            AadiSolves(n,a);
        }
    }
    public static void AadiSolves(int n, int[] a){
        int maxCount=1;
        int max=0;
        for (int i = 0; i < n; i++) {
            if(a[i] > max){
                max = a[i];
                maxCount = 1;
            }
            else if(a[i] == max){
                maxCount++;
            }
        }
        System.out.println(maxCount);
    }
}
