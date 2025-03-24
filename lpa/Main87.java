package dev.lpa;

import java.util.Scanner;

public class Main87 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y= sc.nextInt();
        int w= sc.nextInt();
        int dot=Math.max(y,w);
        int prob=6-dot+1;
        int total=6;
        int a=prob,b=total;
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println((prob/a)+"/"+(total/a));
    }
}
