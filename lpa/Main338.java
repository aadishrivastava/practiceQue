package dev.lpa;
import java.util.*;
public class Main338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] freq = new int[n + 2];
            for (int i = 0; i < n; i++) {
                int count = sc.nextInt();
                if (count <= n){
                    freq[count]++;
                }
            }
            System.out.println(AadiSolves(freq));

        }
    }
    public static String AadiSolves(int[] freq) {
        int MEX = 0;
        while (freq[MEX] > 0) {
            MEX++;
        }
        if (MEX == 0 || (MEX == 1 && freq[0] > 1)) {
            return "NO";
        } else {
                return "YES";
        }
    }
}
