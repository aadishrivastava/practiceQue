package dev.lpa;

import java.util.Scanner;

public class Main49 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int test = 0; test < t; test++) {
            int n = scanner.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = scanner.nextInt();
                }
            }

            int magiccount = 0;

            int[][] change = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int height = a[i][j] + change[i][j];


                    if (height < 0) {
                        int required = -height;
                        magiccount += required;

                        for (int k = 0; k + i < n && k + j < n; k++) {
                            change[i + k][j + k] += required;
                        }
                    }
                }
            }


            System.out.println(magiccount);
        }
    }
}
