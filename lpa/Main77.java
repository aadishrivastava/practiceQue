package dev.lpa;

import java.util.Scanner;

public class Main77 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String c=sc.nextLine();
            String s= "codeforces";
            if(s.contains(c)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
