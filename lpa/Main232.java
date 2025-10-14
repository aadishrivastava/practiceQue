package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            Arrays.sort(arr);
            int score = 0;
            for (int i :arr) {
                if(score==i){
                    score++;
                }
            }
            System.out.println(score);
        }
    }
}
