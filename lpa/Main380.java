package dev.lpa;

import java.util.Scanner;

public class Main380 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int p=sc.nextInt();
            AadiSolves(n,k,p);
        }
    }
    public static void AadiSolves(int n, int k, int p){
        k=Math.abs(k);
        if(k>(n*p)){
            System.out.println(-1);
        }else{
            if(k%p==0){
                System.out.println(k/p);
            }else{
                System.out.println((k/p)+1);
            }
        }
    }
}
