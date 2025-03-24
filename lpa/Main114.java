package dev.lpa;

import java.util.Scanner;

public class Main114 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n= sc.nextInt();
            if(n%3==1 || n%3==2){
                System.out.println("First");
            }else {
                System.out.println("Second");
            }
        }
    }
}
