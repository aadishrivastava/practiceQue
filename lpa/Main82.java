package dev.lpa;

import java.util.*;

public class Main82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            List<Long> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(scanner.nextLong());
            }
            List<Long> b = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                b.add(scanner.nextLong());
            }
            Set<Long> sums = new HashSet<>();
            for (long ai : a) {
                for (long bi : b) {
                    sums.add(ai + bi);
                }
            }
            System.out.println(sums.size() >= 3 ? "YES" : "NO");
        }
        scanner.close();
    }
}