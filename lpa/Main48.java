package dev.lpa;
import java.util.*;
public class Main48 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                int t = scanner.nextInt();
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < t; i++) {
                    int n = scanner.nextInt();
                    int[] a = new int[n];
                    for (int j = 0; j < n; j++) {
                        a[j] = scanner.nextInt();
                    }

                    result.append(BeautifulSegments(a)).append("\n");
                }
                System.out.print(result);
            }

            private static int BeautifulSegments(int[] a) {
                HashMap<Integer, Integer> Map = new HashMap<>();
                int sum = 0;
                int cnt = 0;

                Map.put(0, -1);

                for (int i = 0; i < a.length; i++) {
                    sum += a[i];

                    if (Map.containsKey(sum)) {
                        cnt++;
                        Map.clear();
                        Map.put(0, i);
                        sum = 0;
                    } else {
                        Map.put(sum, i);
                    }
                }

                return cnt;
            }
}
