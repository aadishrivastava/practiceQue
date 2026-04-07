package dev.lpa;

import java.util.*;

public class Main420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }
            int p = sc.nextInt();
            AadiSolves(n,k,arr,p);
        }

    }
    public static void AadiSolves(int n, int k, int[] arr, int p){
        int x = arr[p];
        int left = 0;
        boolean leftBad = false;
        for (int i = 1; i <= p - 1; i++) {
            boolean nowBad = (arr[i] != x);
            if (nowBad != leftBad){
                left++;
            }
            leftBad = nowBad;
        }
        int right = 0;
        boolean rightBad = false;
        for (int i = n; i >= p + 1; i--) {
            boolean curBad = (arr[i] != x);
            if (curBad != rightBad){
                right++;
            }
            rightBad = curBad;
        }
        int ans = Math.max(left, right);
        if (ans % 2 != 0){
            ans++;
        }

        System.out.println(ans);
    }
}