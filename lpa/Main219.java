package dev.lpa;

import java.util.Scanner;

public class Main219 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int n=sc.nextInt();
            System.out.println(n%2==0?0:x);
        }
    }
}
