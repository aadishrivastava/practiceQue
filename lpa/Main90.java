package dev.lpa;

import java.util.Scanner;

public class Main90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline after the integer

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            boolean hasPair = false;

            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    hasPair = true;
                    break;
                }
            }

            if (hasPair) {
                System.out.println(1);
            } else {
                System.out.println(s.length());
            }
        }

        scanner.close();
    }
}