package dev.lpa;
import java.util.Scanner;

public class Main67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int sereja = 0;
        int dima = 0;
        int left = 0;
        int right = n - 1;
        boolean serejaTurn = true;


        while (left <= right) {
            if (num[left] > num[right]) {
                if (serejaTurn) {
                    sereja += num[left];
                } else {
                    dima += num[left];
                }
                left++;
            } else {
                if (serejaTurn) {
                    sereja += num[right];
                } else {
                    dima += num[right];
                }
                right--;
            }
            serejaTurn = !serejaTurn;
        }

        System.out.printf("%d %d", sereja, dima);
    }
}

