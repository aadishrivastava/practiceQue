package dev.lpa;
import java.util.*;
public class Main43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrink = k * l;
        int totalSlices = c * d;

        int toastsByDrink = totalDrink / (n * nl);
        int toastsByLimes = totalSlices / n;
        int toastsBySalt = p / (n * np);

        int maxToasts = Math.min(toastsByDrink, Math.min(toastsByLimes, toastsBySalt));

        System.out.println(maxToasts);
    }
}
