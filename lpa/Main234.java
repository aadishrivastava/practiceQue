package dev.lpa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main234 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            Set<Integer> set=new HashSet<>();
            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextInt();
                set.add(arr[i]);
            }
            System.out.println(set.size());
        }
    }
}
