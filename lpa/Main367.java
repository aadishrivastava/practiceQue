package dev.lpa;

import java.util.Scanner;

public class Main367 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(AadiSolves(n));
        }
    }
    public static String AadiSolves(int n){
        if(n>=4 && n%4==0){
            return "Bob";
        }
        return "Alice";
    }
}
