package dev.lpa;

import java.util.Scanner;

public class Main41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] score=new int[n];

        for (int i = 0; i < n; i++) {
            score[i]= sc.nextInt();
        }
        int min=score[0];
        int max=score[0];
        int count=0;
        for (int i = 1; i < n; i++) {
            if (score[i] > max) {
                max = score[i];
                count++;
            } else if (score[i] < min) {
                min = score[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
