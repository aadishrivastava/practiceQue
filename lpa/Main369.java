package dev.lpa;

import java.util.Scanner;

public class Main369 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s=sc.next();
            System.out.println(AadiSolves(s));
        }
    }
    public static int AadiSolves(String s){
        int remembers=0;
        String pi="314159265358979323846264338327";
        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i)!=pi.charAt(i))){
                return remembers;
            }
            remembers++;
        }
        return s.length();
    }
}
