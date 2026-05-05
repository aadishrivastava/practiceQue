package dev.lpa;

import java.util.Scanner;

public class Main445 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            int[] arr=new int[7];
            for (int i = 0; i < n; i++) {
                arr[s.charAt(i)-'A']++;
            }
            int req=0;
            for (int i = 0; i < 7; i++) {
                if (arr[i]<m){
                    req+=(m-arr[i]);
                }
            }
            System.out.println(req);
        }
    }
}
