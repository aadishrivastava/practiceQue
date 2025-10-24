package dev.lpa;
import java.util.*;

public class Main251 {
    static int locked;

    static long computeBeauty(List<Long> elements) {
        if (elements.size() <= 1) return 0;

        long maxBeauty = Long.MIN_VALUE;
        for (int i = 0; i < elements.size(); i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                maxBeauty = Math.max(maxBeauty, elements.get(j) - elements.get(i));
            }
        }
        return maxBeauty;
    }

    static long solve(List<Long> remaining, boolean isHao, int locked_count) {
        if (locked_count == locked) {
            return computeBeautyLong(remaining);
        }

        if (remaining.isEmpty()) {
            return Long.MIN_VALUE;
        }

        long result;

        if (isHao) {
            // Hao removes - he wants to minimize
            result = Long.MAX_VALUE;
            for (int i = 0; i < remaining.size(); i++) {
                List<Long> next = new ArrayList<>(remaining);
                next.remove(i);
                long val = solve(next, false, locked_count);
                result = Math.min(result, val);
            }
        } else {
            // Alex locks - he wants to maximize
            result = Long.MIN_VALUE;
            for (int i = 0; i < remaining.size(); i++) {
                List<Long> next = new ArrayList<>(remaining);
                next.remove(i);
                long val = solve(next, true, locked_count + 1);
                result = Math.max(result, val);
            }
        }

        return result;
    }

    static long computeBeautyLong(List<Long> elements) {
        if (elements.size() <= 1) return 0;

        long maxBeauty = Long.MIN_VALUE;
        for (int i = 0; i < elements.size(); i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                maxBeauty = Math.max(maxBeauty, elements.get(j) - elements.get(i));
            }
        }
        return maxBeauty;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            List<Long> initial = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                initial.add(sc.nextLong());
            }

            locked = n / 2;

            long answer = solve(initial, true, 0);
            System.out.println(answer);
        }
    }
}
