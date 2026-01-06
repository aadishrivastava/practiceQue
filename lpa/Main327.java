package dev.lpa;

import java.util.Scanner;

public class Main327 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();
            System.out.println(AadiSolve(n,k,s));
        }
    }

    public static int AadiSolve(int n,int k, String s){
        int slept=0;
        int awake=-1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                awake = Math.max(awake, i + k);
                continue;
            }
            if(i<=awake){
                continue;
            }
            slept++;

        }
        return slept;
    }
}
