package dev.lpa;

import java.util.Scanner;

public class Main100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if (a < b && b < c) {
                System.out.println("STAIR");
            } else if (a < b && b > c) {
                System.out.println("PEAK");
            } else {
                System.out.println("NONE");
            }
        }

    }
}
