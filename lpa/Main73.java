package dev.lpa;
import java.util.Scanner;

public class Main73 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        for (int i = 0; i < t; i++) {
            String s = scan.next();

            if (s.length() != 6) {
                System.out.println("NO");
                continue;
            }

            char[] st = s.toCharArray();
            int start = 0;
            for (int j = 0; j < 3; j++) {
                start += (st[j]);
            }

            int end = 0;
            for (int j = 3; j < 6; j++) {
                end += (st[j]);
            }

            if (start == end) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
