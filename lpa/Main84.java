package dev.lpa;

import java.util.Scanner;

public class Main84 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n= sc.nextInt();
            String N=String.valueOf(n);
            char N1=N.charAt(0);
            char N2=N.charAt(1);
            String s1=Character.toString(N1);
            String s2=Character.toString(N2);
            int n1=Integer.parseInt(s1);
            int n2=Integer.parseInt(s2);
            System.out.println(n1+n2);
        }
    }
}
