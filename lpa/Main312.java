package dev.lpa;

import java.util.Scanner;

public class Main312 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(AadiSolves(s));
        }
    }
    public static int AadiSolves(String s){
        if(s.contains("2026") || !s.contains("2025")){
            return 0;
        }
        return 1;
    }
}
