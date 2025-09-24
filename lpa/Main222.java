package dev.lpa;
import java.util.*;
public class Main222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] arr = new long[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                arr[i] = sc.nextLong();
            }

            Arrays.sort(arr);
            long[] entry = new long[n];
            long[] exit = new long[n];

            for (int i = 0; i < n; i++) {
                entry[i] = arr[i];
            }
            for (int i = 0; i < n; i++) {
                exit[i] = arr[i + n];
            }
            long[] ans = new long[n];
            for (int k = 1; k <= n; k++) {
                long total = 0;
                for (int i = 0; i < k; i++) {
                    total += exit[n - k + i] - entry[i];
                }
                ans[k - 1] = total;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();

        }
    }
}
