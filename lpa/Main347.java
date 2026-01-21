package dev.lpa;

import java.util.Scanner;

public class Main347 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(AadiSolves(n,m));

    }
    public static int AadiSolves(int n, int m){
        int count=0;
        for (int i = 0; i*i <= n; i++) {
            for (int j = 0; j*j <= m; j++) {
                if((i*i)+j==n && i+(j*j)==m){
                    count++;
                }
            }
        }
        return count;
    }
}
