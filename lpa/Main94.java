package dev.lpa;

import java.util.Scanner;

public class Main94 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String s= sc.nextLine();
            if(s.charAt(0)=='a'){
                System.out.println("YES");
            } else if(s.charAt(1)=='b'){
                System.out.println("YES");

            } else if(s.charAt(2)=='c'){
                System.out.println("YES");

            }else {
                System.out.println("NO");
            }
        }
    }
}
