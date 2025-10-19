package dev.lpa;
import java.util.*;

public class Main241 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                sc.nextInt();
            }

            System.out.println(solve(a));
        }
        sc.close();
    }

    static int solve(int[] a) {
        int n = a.length;
        Map<Integer, List<Integer>> primeToCosts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int offset = 0; offset <= 2; offset++) {
                int val = a[i] + offset;
                List<Integer> primes = new ArrayList<>();
                getPrimeFactors(val, primes);

                for (int p : primes) {
                    primeToCosts.computeIfAbsent(p, k -> new ArrayList<>()).add(offset);
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for (List<Integer> costs : primeToCosts.values()) {
            if (costs.size() < 2) continue;
            Collections.sort(costs);
            result = Math.min(result, costs.get(0) + costs.get(1));
        }

        return result;
    }

    static void getPrimeFactors(int num, List<Integer> primes) {
        if (num <= 1) return;

        if (num % 2 == 0) {
            primes.add(2);
            while (num % 2 == 0) num /= 2;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                primes.add(i);
                while (num % i == 0) num /= i;
            }
        }

        if (num > 1) primes.add(num);
    }
}
