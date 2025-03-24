package dev.lpa;

import java.util.Scanner;

public class Main66 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                System.out.println(0);
            } else {
                int difference = Math.abs(a - b);
                int count = (difference + 9) / 10;
                System.out.println(count);
            }
        }
    }
}
