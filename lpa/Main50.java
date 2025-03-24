package dev.lpa;

import java.util.Scanner;

public class Main50 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();
            int result;
            if(a>b){
                result=a;
            }else {
                result=Math.max(0,2*a-b);
            }
            System.out.println(result);

        }
    }
}
