package dev.lpa;

import java.util.Scanner;

public class Main370 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s= sc.next();
        System.out.println(AadiSolves(n,s));
    }
    public static int AadiSolves(int n, String s){
        int req=0;
        if(s.length()<3){
            return 0;
        }
        for (int i = 0; i < n - 2; i++) {
            int x1=s.charAt(i);
            int x2=s.charAt(i+1);
            int x3=s.charAt(i+2);
            if((x1==x2 && x2==x3 )&& x3=='x'){
                req++;
            }
        }
        return req;
    }
}
