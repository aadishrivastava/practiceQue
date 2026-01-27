package dev.lpa;

import java.util.Scanner;

public class Main361 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            System.out.println(AadiSolves(s));
        }
    }
    public static int AadiSolves(String s){
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i-1)==s.charAt(i)){
                return 1;
            }
        }
        return s.length();
    }
}
