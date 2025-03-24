package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();  // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();  // Number of lights
            int zero = 0, one = 0;

            int[] ansCheck = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                ansCheck[i] = scanner.nextInt();
            }

            // Count the number of zeroes and ones in the input
            for (int i = 0; i < 2 * n; i++) {
                if (ansCheck[i] == 0) {
                    zero++;
                } else {
                    one++;
                }
            }

            int off = Math.min(zero, one);

            if (zero % 2 == 0) {
                System.out.println(0 + " " + off);
            } else {
                System.out.println(1 + " " + off);
            }

        }


    }
}
