package dev.lpa;

import java.util.Scanner;

public class Main112 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0) {
            String s = sc.nextLine();
            if (s.length() % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            int mid = s.length() / 2;
            boolean flag = true;

            for (int i = 0; i < mid; i++) {
                if (s.charAt(i) != s.charAt(mid + i)) {
                    flag = false;
                    break;
                }
            }

            System.out.println(flag ? "YES" : "NO");
        }
    }
}
