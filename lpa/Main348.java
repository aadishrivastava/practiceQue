package dev.lpa;

import java.util.Scanner;

public class Main348 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        System.out.println(AadiSolves(s,t));
    }
    public static int AadiSolves(String s, String t){
        int count=1, idx=0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i)==s.charAt(idx) && count<s.length()){
                count++;
                idx++;
            }
        }
        return count;
    }
}
