package dev.lpa;

import java.util.Scanner;

public class Main263 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int product=1;
        while(n>0){
            int t=n%10;
            n=n/10;
            product=product*t;
        }
        System.out.println(product);
    }
}
