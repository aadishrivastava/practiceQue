package dev.lpa;
import java.util.Scanner;
public class Main65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {
            StringBuilder beautiful = new StringBuilder(sc.next());
            int query = sc.nextInt();
            int count = 0;
            for (int i = 0; i <= beautiful.length() - 4; i++) {
                if (beautiful.substring(i, i + 4).equals("1100")) {
                    count++;
                }
            }
            StringBuilder result = new StringBuilder();
            while (query-- > 0) {
                int i = sc.nextInt() - 1;
                char v = (char)(sc.nextInt() + '0');

                if (beautiful.charAt(i) != v) {
                    for (int j = Math.max(0, i - 3); j <= Math.min(beautiful.length() - 4, i); j++) {
                        if (beautiful.substring(j, j + 4).equals("1100")) {
                                count--;
                        }
                    }
                    beautiful.setCharAt(i, v);

                    for (int j = Math.max(0, i - 3); j <= Math.min(beautiful.length() - 4, i); j++) {
                        if (beautiful.substring(j, j + 4).equals("1100")) {
                                count++;
                        }
                    }
                }
                result.append(count > 0 ? "YES\n" : "NO\n");
            }
            System.out.print(result);
        }
    }
}
