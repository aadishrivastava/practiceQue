package dev.lpa;
import java.util.*;
public class Main148 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        int[][] points = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                int ring = Math.min(Math.min(i, 9 - i), Math.min(j, 9 - j));
                points[i][j] = ring + 1;
            }
        }

        while (t-- > 0) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                String line = sc.nextLine();
                for (int j = 0; j < 10; j++) {
                    if (line.charAt(j) == 'X') {
                        total += points[i][j];
                    }
                }
            }
            System.out.println(total);
        }
    }
}
