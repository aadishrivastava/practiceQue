package dev.lpa;

import java.util.*;

public class Main63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder result = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            Map<Integer, List<Integer>> brand = new HashMap<>();

            // Read bottle information
            for (int i = 0; i < k; i++) {
                int b = sc.nextInt();
                int c = sc.nextInt();

                brand.putIfAbsent(b, new ArrayList<>());
                brand.get(b).add(c);
            }


            List<Integer> earnings = new ArrayList<>();

            for (List<Integer> costs : brand.values()) {
                Collections.sort(costs, Collections.reverseOrder());
                int brandTotal = 0;

                for (int cost : costs) {
                    brandTotal += cost;
                }

                earnings.add(brandTotal);
            }

            Collections.sort(earnings, Collections.reverseOrder());

            int total = 0;
            for (int i = 0; i < Math.min(n, earnings.size()); i++) {
                total += earnings.get(i);
            }


            result.append(total).append("\n");
        }


        System.out.print(result);
    }
}
