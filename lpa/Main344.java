package dev.lpa;

import java.util.Scanner;

public class Main344 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(AadiSolves(n,m,k));
    }
    public static String AadiSolves(int n, int m,int k){
        if(m>=n && k>=n){
            return "Yes";
        }
        return "No";
    }
}
