package dev.lpa;

import java.util.*;
public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] s = new int[4];
        int count = 0;
        for (int i = 0; i < 4; i++) {
            s[i] = sc.nextInt();
        }
        System.out.println(4 - Arrays.stream(s).distinct().count());
    }
}
