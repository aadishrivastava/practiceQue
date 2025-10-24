package dev.lpa;
import java.util.*;

public class Main252 {
    static int Katrina = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();

            Katrina = 0;
            solve(p);

            for (int i = 0; i < n; i++) {
                if (i > 0) System.out.print(" ");
                System.out.print(p[i]);
            }
            System.out.println();
        }
        sc.close();
    }

    static void solve(int[] p) {
        int n = p.length;
        int[] pos = new int[n + 1];

        for (int i = 0; i < n; i++) pos[p[i]] = i;

        boolean changed = true;
        while (changed) {
            changed = false;
            for (int v = 1; v <= n - 2; v++) {
                int idxV = pos[v];
                int idxV1 = pos[v + 1];
                int idxV2 = pos[v + 2];


                if (idxV2 < idxV && idxV2 < idxV1) {
                    int i = idxV2;
                    int j = Math.min(idxV, idxV1);
                    int k = Math.max(idxV, idxV1);

                    if (!(i < j && j < k)) continue;

                    p[i] -= 2;
                    p[j] += 1;
                    p[k] += 1;

                    pos[p[i]] = i;
                    pos[p[j]] = j;
                    pos[p[k]] = k;

                    Katrina++;
                    changed = true;
                }
            }
        }
    }
}
