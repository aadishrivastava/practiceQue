package dev.lpa;

import java.util.*;

public class Main97 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            Map<Integer, Integer> first = new HashMap<>();
            Map<Integer, Integer> last = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int num = a[i];
                if (!first.containsKey(num)) {
                    first.put(num, i);
                }
                last.put(num, i);
            }
            int max_len = 0;
            int best_l = 0;
            int best_r = 0;
            int left = 0;
            Deque<Integer> maxLastDeque = new LinkedList<>();
            Deque<Integer> minFirstDeque = new LinkedList<>();
            for (int right = 0; right < n; right++) {
                int current = a[right];
                while (!maxLastDeque.isEmpty() && last.get(a[maxLastDeque.peekLast()]) <= last.get(current)) {
                    maxLastDeque.pollLast();
                }
                maxLastDeque.addLast(right);
                while (!minFirstDeque.isEmpty() && first.get(a[minFirstDeque.peekLast()]) >= first.get(current)) {
                    minFirstDeque.pollLast();
                }
                minFirstDeque.addLast(right);
                while (left <= right) {
                    int currentMaxLast = last.get(a[maxLastDeque.peekFirst()]);
                    int currentMinFirst = first.get(a[minFirstDeque.peekFirst()]);
                    if (currentMaxLast > right || currentMinFirst < left) {
                        if (maxLastDeque.peekFirst() == left) {
                            maxLastDeque.pollFirst();
                        }
                        if (minFirstDeque.peekFirst() == left) {
                            minFirstDeque.pollFirst();
                        }
                        left++;
                    } else {
                        break;
                    }
                }
                int current_len = right - left + 1;
                if (current_len > max_len) {
                    max_len = current_len;
                    best_l = left;
                    best_r = right;
                }
            }
            if (max_len == 0) {
                System.out.println("0");
                continue;
            }
            int l = best_l;
            int r = best_r;
            int k = r - l + 1;
            Set<Integer> leftDistinct = new HashSet<>();
            for (int i = 0; i < l; i++) {
                leftDistinct.add(a[i]);
            }
            Set<Integer> rightDistinct = new HashSet<>();
            for (int i = r + 1; i < n; i++) {
                rightDistinct.add(a[i]);
            }
            Set<Integer> union = new HashSet<>(leftDistinct);
            union.addAll(rightDistinct);
            int u = union.size();
            int splitScore = (n - k) - u;
            int originalD = first.size();
            int originalScore = n - originalD;
            if (splitScore >= originalScore) {
                System.out.println((best_l + 1) + " " + (best_r + 1));
            } else {
                System.out.println("0");
            }
        }
    }
}
