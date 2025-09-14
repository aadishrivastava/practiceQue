package dev.lpa;

import java.util.*;
public class Main215 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long  n=sc.nextLong();
            long x=sc.nextLong();
            long y=sc.nextLong();
            System.out.println(paint(n,x,y)?"YES":"NO");
        }
    }
    public static boolean paint(long n, long x, long y){
        if(n%2==0){
            if(x%2==0 && y%2==0){
                return true;
            } else if (y%2==0 && y>x) {
                return true;
            }
        }else{
            if(x%2!=0 && y%2!=0){
                return true;
            } else if (y%2!=0 && y>x) {
                return true;
            }
        }
        return false;
    }
}