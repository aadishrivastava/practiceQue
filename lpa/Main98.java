package dev.lpa;

import java.util.Scanner;

public class Main98 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s1=sc.next();
            String s2= sc.next();
            String replace = s2.charAt(0) + s1.substring(1);
            String replace2=s1.charAt(0) + s2.substring(1);
            System.out.println(replace+" "+replace2);
        }
    }
}
