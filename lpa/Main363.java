package dev.lpa;

import java.util.Scanner;

public class Main363 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            System.out.println(AadiSolves(n));
        }
    }
    public static int AadiSolves(int n){
        int p = Integer.highestOneBit(n);
        return p - 1;
    }
}
