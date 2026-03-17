package dev.lpa;

import java.util.Scanner;

public class Main389 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong();
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            AadiSolves(n,a,b,c);
        }
    }
    public static void AadiSolves(long n, long a, long b, long c){
        long total=a+b+c;

        long operations=n/total;
        long days=operations*3;
        long cycleSum=total*operations;
        if(cycleSum<n){
            days++;
            cycleSum+=a;
        }
        if(cycleSum<n){
            days++;
            cycleSum+=b;
        }if(cycleSum<n){
            days++;
        }
        System.out.println(days);

    }
}
