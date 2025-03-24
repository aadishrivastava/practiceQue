package dev.lpa;

import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[][] tram = new int[n][2];
        int count=0;
        int max=0;

        for (int i = 0; i < n; i++) {
            tram[i][0]= sc.nextInt();
            tram[i][1]=sc.nextInt();
            count+=tram[i][1]-tram[i][0];
            max=Math.max(max,count);
        }


        System.out.println(max);
    }
}
