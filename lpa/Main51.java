package dev.lpa;

import java.util.*;

public class Main51 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            for (int test = 0; test < t; test++) {
                int n = scanner.nextInt();
                int[][] stamp = new int[n][2];
                for (int i = 0; i < n; i++) {
                    stamp[i][0] = scanner.nextInt();
                    stamp[i][1] = scanner.nextInt();
                }

                int perimeter = MinSumPerimeter(stamp);
                System.out.println(perimeter);
            }
        }

        private static int MinSumPerimeter(int[][] stamp) {

            int maxWidth = 0, maxHeight = 0;
            for (int[] stamps : stamp) {
                maxWidth = Math.max(maxWidth, stamps[0]);
                maxHeight = Math.max(maxHeight, stamps[1]);
            }
            return 2 * (maxWidth + maxHeight);
        }
}
