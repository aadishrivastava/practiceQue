package dev.lpa;

import java.util.Scanner;

public class Main32 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        int count=0;
        int[][] games=new int[n][2];
        for (int i = 0; i < n; i++) {
            games[i][0]= sc.nextInt();
            games[i][1]= sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(games[i][0]==games[j][1]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
