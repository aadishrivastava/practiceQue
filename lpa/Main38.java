package dev.lpa;

import java.util.Scanner;
import java.util.Arrays;

public class Main38 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int x3 = scan.nextInt();

        int[] points = {x1, x2, x3};
        Arrays.sort(points);

        int point = points[1];

        int distance = Math.abs(x1 - point) + Math.abs(x2 - point) + Math.abs(x3 - point);

        System.out.println(distance);
    }
}

