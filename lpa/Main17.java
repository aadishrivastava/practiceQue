package dev.lpa;

import java.util.Scanner;

public class Main17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        int nextYear = y + 1;
        while (!hasDistinctDigits(nextYear)) {
            nextYear++;
        }

        System.out.println(nextYear);
    }
    public static boolean hasDistinctDigits(int year) {
        String yearStr = Integer.toString(year);
        for (int i = 0; i < yearStr.length(); i++) {
            for (int j = i + 1; j < yearStr.length(); j++) {
                if (yearStr.charAt(i) == yearStr.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

