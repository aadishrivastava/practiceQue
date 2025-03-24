package dev.lpa;

import java.util.Scanner;

public class Main89 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String W=sc.nextLine();
            String w=W.endsWith("us") ? W.substring(0, W.length() - 2) + "i" : W;
            System.out.println(w);
        }
    }
}
