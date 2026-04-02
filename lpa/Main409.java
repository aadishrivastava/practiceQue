package dev.lpa;

import java.util.Scanner;

public class Main409 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a==0){
                System.out.println(1);
                continue;
            }
            System.out.println(a+(b*2)+1);
        }
    }
}
