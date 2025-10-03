package dev.lpa;

import java.util.Scanner;

public class Main227 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }

            boolean found = false;
            for (int i = 1; i < n-1 && !found; i++) {
                for (int j = i+1; j < n && !found; j++) {
                    int sum1=0,sum2=0,sum3=0;
                    for (int k = 0; k <= i; k++){
                        sum1 += arr[k];
                    }
                    for (int k = i + 1; k <= j; k++){
                        sum2 += arr[k];
                    }
                    for (int k = j + 1; k < n; k++){
                        sum3 += arr[k];
                    }
                    int s1 = sum1 % 3, s2 = sum2 % 3, s3 = sum3 % 3;
                    if ( (s1 != s2 && s2 != s3 && s3 != s1) || (s1 == s2 && s2 == s3) ) {
                        System.out.println((i) + " " + (j));
                        found = true;
                    }
                }
            }
            if (!found) {
                System.out.println("0 0");
            }
        }
    }
}
