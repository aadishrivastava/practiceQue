package dev.lpa;
import java.util.*;
public class Main240 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            List<Integer> ones = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') ones.add(i);
            }

            if (ones.isEmpty()) {
                System.out.println(0);
                continue;
            }

            int count = 1;
            int last = ones.getFirst();

            for (int i = 1; i < ones.size(); i++) {
                if (ones.get(i) - last >= k) {
                    count++;
                }
                last = ones.get(i);
            }

            System.out.println(count);
        }


    }
}
