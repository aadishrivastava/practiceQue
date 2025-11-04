package dev.lpa;

import java.util.Scanner;

public class Main257 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            System.out.println(Square(a,b,c,d));
        }
    }
    public static String Square(int a, int b, int c,int d){
        if(a==b && b==c && c==d){
            return "YES";
        }
        return "NO";
    }
}
