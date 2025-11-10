package dev.lpa;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main296 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int k=sc.nextInt();
        Set<Integer> set=new HashSet<>();
        int count=0;
        for (int i = 0; i < n; i++) {
            if(set.contains(k-arr[i])){
                count++;
            }
            set.add(arr[i]);
        }
        System.out.println(count);
    }
}
