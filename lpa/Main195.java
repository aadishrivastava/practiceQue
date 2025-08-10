package dev.lpa;
import java.util.*;

public class Main195 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            List<Long> w = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                w.add(sc.nextLong());
            }

            int coins = 0;
            while (!w.isEmpty()) {
                long nearestWeight = Long.MIN_VALUE;
                int nearestIndex = -1;

                for (int j = 0; j < w.size(); j++) {
                    if (w.get(j) <= c && w.get(j) > nearestWeight) {
                        nearestWeight = w.get(j);
                        nearestIndex = j;
                    }
                }

                if (nearestIndex == -1) {
                    nearestIndex = 0;
                }

                if (w.get(nearestIndex) > c) {
                    coins++;
                }


                w.remove(nearestIndex);

                w.replaceAll(aLong -> aLong * 2);
            }

            System.out.println(coins);
        }
        sc.close();
    }
}
