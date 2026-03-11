package dev.lpa;

import java.util.Scanner;

public class Main375 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int m= sc.nextInt();
            int d=sc.nextInt();
            int count=1;
            int startWeight=0;
            for (int i = 0; i < n; i++) {
                startWeight+=m;
                if(startWeight-m>d){
                    count++;
                    startWeight=m;
                }

            }
            System.out.println(count);
        }
    }
}
