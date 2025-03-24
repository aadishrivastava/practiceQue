package dev.lpa;

import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        double[] p=new double[n];
        double sum=0;

        for (int i = 0; i < n; i++) {
            p[i]=sc.nextInt();
            sum+=p[i];
        }
        System.out.println(sum/n);
    }
}
