package dev.lpa;
import java.util.*;
public class Main236 {
    static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    static String removeIndices(String s, boolean[] remove) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!remove[i]) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean found = false;
            List<Integer> result = new ArrayList<>();


            for (int mask = 0; mask < (1 << n) && !found; mask++) {
                List<Integer> subseq = new ArrayList<>();
                boolean[] remove = new boolean[n];

                for (int i = 0; i < n; i++) {
                    if ((mask & (1 << i)) != 0) {
                        subseq.add(i);
                        remove[i] = true;
                    }
                }

                boolean nonDecreasing = true;
                for (int i = 0; i < subseq.size() - 1; i++) {
                    if (s.charAt(subseq.get(i)) > s.charAt(subseq.get(i + 1))) {
                        nonDecreasing = false;
                        break;
                    }
                }

                if (nonDecreasing) {
                    String remaining = removeIndices(s, remove);
                    if (isPalindrome(remaining)) {
                        found = true;
                        result = subseq;
                    }
                }
            }

            if (found) {
                System.out.println(result.size());
                if(result.isEmpty()){
                    System.out.println();
                    continue;
                }
                if (!result.isEmpty()) {
                    for (int i = 0; i < result.size(); i++) {
                        System.out.print((result.get(i) + 1)); // 1-indexed
                        if (i < result.size() - 1) System.out.print(" ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println(-1);
            }
        }
    }
}
