package dev.lpa;

import java.util.Scanner;

public class Main62 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();

        while(t-- >0){
            boolean flag=true;
            int n= sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
            }
            for (int i = 0; i < n-1; i++) {
                if(Math.abs(a[i]-a[i+1])==5 || Math.abs(a[i]-a[i+1])==7){
                    flag=true;
                }else {
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
