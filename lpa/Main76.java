package dev.lpa;

import java.util.Scanner;

public class Main76 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            int a= sc.nextInt();
            int b= sc.nextInt();;
            int c= sc.nextInt();
            if(a+b==c){
                System.out.println("+");
            }else {
                System.out.println(("-"));
            }
        }
    }
}
