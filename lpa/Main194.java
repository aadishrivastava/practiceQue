package dev.lpa;
import java.util.*;

public class Main194 {
    public static void main(String []  args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = s.nextInt();

            int p = 0;
            String ans = "";
            for (int l = 0, r = n - 1; l < r; l++, r--) {
                if (p % 2 == 0) {
                    ans += (arr[l] > arr[r] ? "LR" : "RL");
                } else {
                    ans += (arr[l] > arr[r] ? "RL" : "LR");
                }
                p++;
            }


            if ((n & 1) == 1) ans += 'L';

            System.out.println(ans);

        }
    }
}
