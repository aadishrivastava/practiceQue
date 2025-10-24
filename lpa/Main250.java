package dev.lpa;
import java.util.*;

public class Main250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            String s = sc.next();

            boolean allA = true;
            for (char c : s.toCharArray()) {
                if (c == 'B') {
                    allA = false;
                    break;
                }
            }

            long[] queries = new long[q];
            for (int i = 0; i < q; i++){
                queries[i] = sc.nextLong();
            }

            for (long a : queries) {
                if (allA) {
                    System.out.println(a);
                    continue;
                }

                long seconds = 0;
                int machineIdx = 0;

                while (a > 0) {
                    char type = s.charAt(machineIdx);
                    a = (type == 'A') ? a - 1 : a / 2;
                    seconds++;
                    if (a > 0) machineIdx = (machineIdx + 1) % n;
                }

                System.out.println(seconds);
            }
        }
    }
}
