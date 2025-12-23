package dev.lpa;

import java.util.Scanner;

public class Main308 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int k=sc.nextInt();
            int x=sc.nextInt();
            System.out.println(AadiSolves(k,x));
        }
    }

    public static int AadiSolves(int k,int x){
        return k*x+1;
    }
}
