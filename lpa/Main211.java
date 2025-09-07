package dev.lpa;
import java.util.*;
public class Main211 {
    public static void main(String[] args) {


        String[] cards1 = {"aa","ab","ba","ac"};
        char x1 = 'a';
        System.out.println(maxPoints(cards1, x1)); // Output: 2

        String[] cards2 = {"aa","ab","ba"};
        char x2 = 'a';
        System.out.println(maxPoints(cards2, x2)); // Output: 1

        String[] cards3 = {"aa","ab","ba","ac"};
        char x3 = 'b';
        System.out.println(maxPoints(cards3, x3)); // Output: 0
    }
    public static int maxPoints(String[] cards, char x) {
        // Store input midway

        // Filter cards that contain x
        List<String> validCards = new ArrayList<>();
        for (String card : cards) {
            if (card.indexOf(x) != -1) {
                validCards.add(card);
            }
        }

        int n = validCards.size();
        boolean[] used = new boolean[n];

        return backtrack(validCards, used);
    }

    // Backtracking: try all possible pairs
    public static int backtrack(List<String> cards, boolean[] used) {
        int n = cards.size();

        // find first unused card
        int i = -1;
        for (int k = 0; k < n; k++) {
            if (!used[k]) {
                i = k;
                break;
            }
        }
        if (i == -1) return 0; // all cards used

        int best = 0;
        used[i] = true;

        // Try pairing i with each other unused card
        for (int j = i + 1; j < n; j++) {
            if (!used[j] && isCompatible(cards.get(i), cards.get(j))) {
                used[j] = true;
                best = Math.max(best, 1 + backtrack(cards, used));
                used[j] = false;
            }
        }

        used[i] = false;
        return best;
    }

    // Check if two cards differ in exactly one position
    private static boolean isCompatible(String a, String b) {
        int diff = 0;
        for (int i = 0; i < 2; i++) {
            if (a.charAt(i) != b.charAt(i)) diff++;
        }
        return diff == 1;
    }
}
