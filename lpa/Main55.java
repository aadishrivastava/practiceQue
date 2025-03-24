package dev.lpa;
import java.util.Scanner;
public class Main55 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();

            while (t-- > 0) {
                int n = scanner.nextInt();
                long[] a = new long[n];

                for (int i = 0; i < n; i++) {
                    a[i] = scanner.nextLong();
                }

                System.out.println(findMinimumK(a, n));
            }

            scanner.close();
        }

        private static int findMinimumK(long[] a, int n) {
            int minK = 0;
            for (int i = 1; i < n; i++) {
                int k = (int) ((a[i] - a[i - 1] + 1) / 2);
                minK = Math.max(minK, k);
            }
            return minK;
        }






}
