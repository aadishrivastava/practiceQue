package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main54 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int[] x=new int[4];

        for (int i = 0; i < 4; i++) {
            x[i]= sc.nextInt();
        }
        Arrays.sort(x);
        System.out.print(x[3]-x[1]);
        System.out.print(" ");
        System.out.print(x[3]-x[2]);
        System.out.print(" ");
        System.out.print(x[3]-x[0]);
    }
}
