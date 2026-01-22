package dev.lpa;

import java.util.Scanner;

public class Main350 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            System.out.println(AadiSolves(s));
        }
    }
    public static String AadiSolves(String s){
        int bCount=0;
        int elseCount=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='B'){
                bCount++;
            }else {
                elseCount++;
            }
        }
        return bCount==elseCount?"YES":"NO";
    }
}
