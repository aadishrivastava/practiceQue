package dev.lpa;

import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        System.out.print("");
        String s=sc.next();
        for(int i=t;i>0;i--){
            s=s.replace("BG","GB");
        }
        System.out.println(s);
    }
}

