package dev.lpa;

import java.util.Scanner;

public class Main78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            if(a<b && c>b){
                System.out.println(b);
            } else if (b<a && c>a) {
                System.out.println(a);
            }else if(b>a && c<a){
                System.out.println(a);
            }else if(a>b && c<b){
                System.out.println(b);
            }else{
                System.out.println(c);
            }
        }
    }
}
