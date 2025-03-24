package dev.lpa;

import java.util.Scanner;

public class Main36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String guest=sc.nextLine();
        String host=sc.nextLine();
        String letters=sc.nextLine();
        int[] count = new int[26];
        for (char c : guest.toCharArray()) {
            count[c - 'A']++;
        }
        for (char c : host.toCharArray()) {
            count[c - 'A']++;
        }
        for (char c : letters.toCharArray()) {
            count[c - 'A']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}
