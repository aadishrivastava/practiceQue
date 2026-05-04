package dev.lpa;

import java.util.Scanner;

public class Main443 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int diff=Math.abs(b-a);
            int largest=diff*2;
            if(c>largest || b> largest || a>largest){
                System.out.println(-1);
            }else{
                System.out.println(c-diff>0?c-diff:diff+c);
            }
        }
    }
}
