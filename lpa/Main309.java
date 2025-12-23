package dev.lpa;
import java.util.Scanner;

public class Main309 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                max = Math.max(max, a[i]);
            }
            System.out.println(AadiSolves(a));
        }
    }
    public static int AadiSolves(int[] a) {
        int n = a.length;
        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            result += Math.abs(a[i] - a[i + 1]);
        }
        int answer = result;
        for (int i = 1; i < n - 1; i++) {
            int curr = result - Math.abs(a[i - 1] - a[i]) - Math.abs(a[i] - a[i + 1]) + Math.abs(a[i - 1] - a[i + 1]);
            answer = Math.min(answer, curr);
        }
        answer = Math.min(answer, result - Math.abs(a[0] - a[1]));
        answer = Math.min(answer, result - Math.abs(a[n - 2] - a[n - 1]));
        return answer;
    }
}
