package dev.lpa;
import java.util.*;

public class Main106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            List<Integer> keyArray = generateKeyArray(n, x);

            if (keyArray == null) {
                output.append("-1\n"); // If a valid array isn't possible, return -1
            } else {
                for (int num : keyArray) {
                    output.append(num).append(" ");
                }
                output.append("\n");
            }
        }

        System.out.print(output);
        sc.close();
    }

    private static List<Integer> generateKeyArray(int n, int x) {
        List<Integer> key = new ArrayList<>();
        int currentOR = 0;

        // Fill first n-1 elements with sequential numbers
        for (int i = 0; i < n - 1; i++) {
            key.add(i);
            currentOR |= i;
        }

        int lastElement = x ^ currentOR; // Ensure final OR is x

        // Edge case: If lastElement is negative or already present, return null
        if (lastElement < 0 || lastElement >= (n - 1)) {
            return null;
        }

        key.add(lastElement);
        return key;
    }
}
