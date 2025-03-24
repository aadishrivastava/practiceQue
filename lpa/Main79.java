package dev.lpa;

import java.util.Scanner;

public class Main79 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int[] a=new int[t];
        for (int i = 0; i < t; i++) {
            a[i]= sc.nextInt();
        }
        int max=a[0];
        for (int i = 0; i < t; i++) {
            if(a[i]>max){
                max=a[i];
            }
        }
        int s=0;
        for (int i = 0; i < t; i++) {
            s+=max-a[i];
        }
        System.out.println(s);
    }
}
