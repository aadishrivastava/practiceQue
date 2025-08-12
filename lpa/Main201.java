package dev.lpa;
import java.util.*;
public class Main201 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-- > 0) {
            StringBuilder result = new StringBuilder();

            String s = sc.next();
            int[] counts = new int[26];
            for (char ch : s.toCharArray()) {
                counts[ch - 'A']++;
            }

            result.append("T".repeat(counts['T' - 'A']));
            result.append("N".repeat(counts['N' - 'A']));
            result.append("F".repeat(counts['F' - 'A']));

            for (int i = 0; i < 26; i++) {
                char ch = (char) ('A' + i);
                if (ch != 'F' && ch != 'N' && ch != 'T') {
                    result.append(String.valueOf(ch).repeat(counts[i]));
                }
            }

            System.out.println(result);
        }
    }
}
