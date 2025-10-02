package dev.lpa;

import java.util.Scanner;

public class Main225 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[m];
            boolean flag=true;
            for (int i = 0; i < m; i++) {
                a[i]=sc.nextInt();
                if(i>0 && a[i-1]>=a[i]) {
                    flag=false;
                }
            }

            if(!flag){
                System.out.println(1);
            }else{
                System.out.println(Math.min(n-a[0],n-a[m-1])+1);
            }
        }
    }
}
