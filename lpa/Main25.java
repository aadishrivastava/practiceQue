package dev.lpa;

import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String m= scan.nextLine();
        int n=Integer.parseInt(m);

        int x= scan.nextInt();
        int[] p= new int[x];
        for (int i = 0; i < x; i++) {
            p[i]=scan.nextInt();
        }
        int y= scan.nextInt();
        int[] a= new int[y];
        for (int i = 0; i <y ; i++) {
            a[i]=scan.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            boolean found=false;
            for (int j = 0; j < x; j++) {
                if(p[j]==i){
                    found=true;
                    break;
                }
            }
            if (!found) {
                for (int j = 0; j < y; j++) {
                    if (a[j] == i) {
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
    }
}
