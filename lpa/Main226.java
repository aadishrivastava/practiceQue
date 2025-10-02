package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main226 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int[] a=new int[n/2];
            int j=0;
            for (int i = 0; i < n-1 && j<n/2; i=i+2) {
                a[j]=arr[i+1]-arr[i];
                j++;
            }

            int maxDiff=0;
            for (int i = 0; i < a.length; i++) {
                maxDiff=Math.max(maxDiff,a[i]);
            }
            System.out.println(maxDiff);
        }
    }
}
