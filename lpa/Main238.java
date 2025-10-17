package dev.lpa;
import java.io.*;
public class Main238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            solveBeautifulTree(n, out);
        }

        out.flush();
    }

    static void solveBeautifulTree(int n, PrintWriter out) {
        if (n == 2) {
            out.println(-1);
            return;
        }

        int center = n;

        long sumOthers = ((long)n * (n - 1)) / 2;
        long S = center * sumOthers;

        if (!isPerfectSquare(S)) {
            center = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (i != center) {
                out.println(center + " " + i);
            }
        }
    }

    static boolean isPerfectSquare(long x) {
        long sqrt = (long)Math.sqrt(x);
        return sqrt * sqrt == x;
    }
}
