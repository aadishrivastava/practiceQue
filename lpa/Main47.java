package dev.lpa;

import java.util.Scanner;

public class Main47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int x = 0;
            boolean sakurokichance = true;

            for (int j = 1;j<Integer.MAX_VALUE ; j++) {
                int move = 2*j-1;

                if (sakurokichance) {
                    x -= move;
                } else {
                    x += move;
                }


                if (Math.abs(x) > n) {
                    if (sakurokichance) {
                        System.out.println("Sakurako");
                    } else {
                        System.out.println("Kosuke");
                    }
                    break;
                }
                sakurokichance=!sakurokichance;
            }
        }
    }
}
