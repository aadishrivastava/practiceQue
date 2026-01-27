package dev.lpa;

import java.util.Scanner;

public class Main360 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(AadiSolves(a,b));
        }
    }
    public static String AadiSolves(int a, int b){
        if (a%2!=0){
            return "NO";
        }else if (b%2==0){
            return "YES";
        } else if(a>=2){
            return "YES";
        }
        return "NO";
    }
}
