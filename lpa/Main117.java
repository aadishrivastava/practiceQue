package dev.lpa;
import java.util.Scanner;
public class Main117 {
    public static void operations(Scanner sc) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            long sum = 0;

            for (int i = 0; i < n; i++) {
                long val = sc.nextLong();
                sum += val;
            }

            if (sum == (long) n * x) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int ttt = sc.nextInt();

            while (ttt-- > 0) {
                operations(sc);
            }

            sc.close();
    }

}
