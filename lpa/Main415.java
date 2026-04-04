package dev.lpa;

import java.util.Scanner;

public class Main415 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            AadiSolves(n);
        }
    }
    public static void AadiSolves(int n){
        System.out.println(n==67?67:n+1);
    }
}
