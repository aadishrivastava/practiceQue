package dev.lpa;
import java.util.*;
public class Main249 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans;
            if (n <= 4) ans = 1;
            else ans = (n - 1) / 2;
            System.out.println(ans);
        }
    }
}
