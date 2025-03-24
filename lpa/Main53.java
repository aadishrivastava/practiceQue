package dev.lpa;

import java.util.Scanner;

public class Main53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 1) {
                // Impossible to have a single-digit number divisible by 66 with only '3' and '6'
                System.out.println(-1);
            } else {
                // Construct the smallest number with '6' and adjust to make it divisible by 11
                StringBuilder result = new StringBuilder();

                // Step 1: Fill the entire number with '6'
                for (int i = 0; i < n; i++) {
                    result.append("6");
                }

                // Step 2: Check if the alternating sum condition for divisibility by 11 holds
                int oddSum = 0, evenSum = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        oddSum += result.charAt(i) - '0'; // Character to integer
                    } else {
                        evenSum += result.charAt(i) - '0';
                    }
                }

                // If alternating sum condition is not met, adjust one digit from '6' to '3'
                if (Math.abs(oddSum - evenSum) % 11 != 0) {
                    // Change the last '6' to '3'
                    result.setCharAt(n - 1, '3');
                }

                System.out.println(result);
            }
        }
        sc.close();
    }
}
