package dev.lpa;

import java.util.Scanner;

public class Main81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int a = 4; a < t; a++) {
            int b = t - a;


            if (isComposite(a) && isComposite(b)) {
                System.out.println(a + " " + b);
                return;
            }
        }
    }
    public static boolean isComposite(int x){
        if (x < 4){
            return false;
        }
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return true;
            }
        }
        return false;
    }
}
