package dev.lpa;
import java.util.*;

public class Main185 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            StringBuilder xCopy = new StringBuilder(x);
            int moves = 0;
            int maxLength = 25 + m - 1;
            while (xCopy.length() <= maxLength) {
                if (xCopy.toString().contains(s)) {
                    System.out.println(moves);
                    break;
                }
                xCopy.append(xCopy);
                moves++;
            }
            if (!xCopy.toString().contains(s)) {
                System.out.println(-1);
            }
        }
    }
}
