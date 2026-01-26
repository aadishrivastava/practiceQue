package dev.lpa;

import java.util.Scanner;

public class Main358 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String pos=sc.next();
            String[] ans=AadiSolves(pos);
            for (String s:ans){
                System.out.println(s);
            }
        }
    }
    public static String[] AadiSolves(String pos){
        String[] ans=new String[14];
        int idx=0;
        char first= pos.charAt(0);
        int second=pos.charAt(1) - '0';
        for (char col = 'a'; col <= 'h'; col++) {
            if(col!=first ){
                ans[idx]=col+""+second;
                idx++;
            }
        }
        for (int row = 1; row <=8 ; row++) {
            if(row!=second){
                ans[idx]=first+""+row;
                idx++;
            }
        }
        return ans;
    }
}
