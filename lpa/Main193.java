package dev.lpa;

import java.util.Scanner;

public class Main193 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = i + 1;
            }

            for (int i = 0; i < n - 1; i += 2) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            if (n % 2 == 1) {
                int temp = arr[n - 1];
                arr[n - 1] = arr[n - 2];
                arr[n - 2] = temp;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();


        }
    }
}
