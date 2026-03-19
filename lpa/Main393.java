package dev.lpa;

import java.util.Scanner;

public class Main393 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long p=sc.nextLong();
            long q=sc.nextLong();
            AadiSolves(p,q);
        }
    }
    public static void AadiSolves(long p, long q){
        if(p<q && 2*q<=3*p){
            System.out.println("Bob");
        }
        else{
            System.out.println("Alice");
        }
    }
}
