package dev.lpa;

import java.util.Scanner;

public class Main411 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int[] arr=new int[n];
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                min=Math.min(min,arr[i]);
                max=Math.max(max,arr[i]);
            }
            int near=Math.min(Math.abs(s-min),Math.abs(s-max));
            System.out.println(near + (max - min));


        }
    }
}
