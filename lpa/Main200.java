package dev.lpa;
import java.util.*;
public class Main200 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long k=sc.nextLong();
            if(a<=k && b<=k){
                System.out.println(1);
                continue;
            }
            long g = gcd(a, b);
            long dx = a / g;
            long dy = b / g;

            if (dx <= k && dy <= k) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
    static long gcd(long x, long y) {
        while (y != 0) {
            long temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
