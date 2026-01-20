package dev.lpa;

import java.util.Scanner;

public class Main345 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            String s=sc.next();

            System.out.println(AadiSolves(k,s));
        }
    }
    public static int AadiSolves(int k,String s){
        int operations=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='B'){
                operations++;
                i+=k-1;
            }
        }
        return operations;
    }
}
