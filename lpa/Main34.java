package dev.lpa;

import java.util.Scanner;

public class Main34 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        int[] n=new int[t];
        for (int i = 0; i < t; i++) {
            n[i]= sc.nextInt();
            sc.nextLine();

            if(n[i]%2==0){
                System.out.println(n[i]/2-1);
                continue;
            }else {
                System.out.println(n[i]/2);
                continue;
            }
        }
    }
}
