package dev.lpa;

import java.util.Scanner;

public class Main35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        for (int i = 1; i <=n; i++) {

                if(i%2!=0){
                    System.out.println("#".repeat(m));
                } else if (i%4==0) {
                    System.out.println("#"+".".repeat(m-1));
                } else {
                    System.out.println(".".repeat(m-1)+"#");
                }

        }
    }
}
