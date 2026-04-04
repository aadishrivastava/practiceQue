package dev.lpa;

import java.util.Scanner;

public class Main412 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int [n];
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            max=Math.max(max,arr[i]);
        }
        int max2=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i]<max && arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max2==Integer.MIN_VALUE?"No Such element exists":max2);
    }
}
