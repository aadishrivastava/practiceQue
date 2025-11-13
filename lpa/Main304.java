package dev.lpa;

import java.util.Scanner;

public class Main304 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=sc.nextInt();
        s=s.trim();
        String[] arr=s.split(",");
        int[] array=new int[n];
        for (int i = 0; i < n; i++) {
            array[i]=Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
