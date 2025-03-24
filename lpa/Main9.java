package dev.lpa;

import java.util.*;

public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();

        for (int i = 1; i <= w; i++) {
            n=n-(k*i);

        }
        if (n > 0) {
            System.out.println(0);
        }else{
            System.out.println(Math.abs(n));
        }

    }








}
