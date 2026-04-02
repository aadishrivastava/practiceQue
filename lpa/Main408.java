package dev.lpa;

import java.util.Scanner;

public class Main408 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int count=0;
        for (int i = 0; i < n.length()-2; i++) {
            for (int j = i+1; j < n.length()-1; j++) {
                for (int k = j+1; k < n.length(); k++) {
                    if (n.charAt(i)=='Q' && n.charAt(j)=='A' && n.charAt(k)=='Q'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);

    }
}
