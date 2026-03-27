package dev.lpa;

import java.util.Scanner;

public class Main401 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x= sc.nextInt();
            AadiSolves(x);
        }
    }
    public static void AadiSolves(int x){
        System.out.println(x-1);
    }
}
