package dev.lpa;

public class Main210 {
    public static int getLeastFrequentDigit(int n) {
        int[] freq = new int[10];

        String num = String.valueOf(n);
        for (char c : num.toCharArray()) {
            freq[c - '0']++;
        }

        int minFreq = Integer.MAX_VALUE;
        int result = -1;

        for (int d = 0; d <= 9; d++) {
            if (freq[d] > 0) {
                if (freq[d] < minFreq) {
                    minFreq = freq[d];
                    result = d;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(getLeastFrequentDigit(1553322));   // Output: 1
        System.out.println(getLeastFrequentDigit(723344511)); // Output: 2
    }
}
