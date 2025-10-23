package dev.lpa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main248 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            if (intersect(a, b, c, d)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean intersect(int a, int b, int c, int d) {
        Set<Integer> arc1 = new HashSet<>();
        int pos = a;
        while (true) {
            arc1.add(pos);
            if (pos == b) break;
            pos = (pos % 12) + 1;
        }

        if (arc1.contains(c) && arc1.contains(d)){
            return false;
        }
        if (!arc1.contains(c) && !arc1.contains(d)){
            return false;
        }
        return true;
    }
}
