package dev.lpa;

import java.util.Scanner;

public class Main376 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            long a= sc.nextLong();
            long b= sc.nextLong();
            long c= sc.nextLong();
            long d= sc.nextLong();
            AadiSolves(a,b,c,d);
        }
    }
    public static void AadiSolves(long a, long b, long c, long d){
        if (b>d){
            System.out.println(-1);
            return;
        }
        long result=0;
        a+=(d-b);
        result+=(d-b);
        if(a<c){
            System.out.println(-1);
            return;
        }
        result+=(a-c);
        System.out.println(result);
    }
}
