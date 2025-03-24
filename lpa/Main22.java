package dev.lpa;
import java.util.*;
public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxRed1 = 0;
            int Count1 = 0;
            for (int i = 0; i < n; i += 2) {
                maxRed1 = Math.max(maxRed1, arr[i]);
                Count1++;
            }
            int score1 = maxRed1 + Count1;
            int maxRed2 = 0;
            int Count2 = 0;
            for (int i = 1; i < n; i += 2) {
                maxRed2 = Math.max(maxRed2, arr[i]);
                Count2++;
            }
            int score2 = maxRed2 + Count2;
            int Score = Math.max(score1, score2);

            System.out.println(Score);
        }

        sc.close();
    }
}
