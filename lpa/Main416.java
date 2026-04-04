package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main416 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int[] arr=new int[7];
            for (int i = 0; i < 7; i++) {
                arr[i]=sc.nextInt();
            }
            AadiSolves(arr);
        }
    }
    public static void AadiSolves(int[] arr){
        Arrays.sort(arr);
        int sum=0;
        for (int i = 0; i < 6; i++) {
            sum+=arr[i];
        }
        System.out.println(arr[6]-sum);
    }
}
