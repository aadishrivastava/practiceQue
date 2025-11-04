package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main259 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int zero=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[zero];
                arr[zero]=temp;
                zero++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
