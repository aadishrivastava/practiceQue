package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main293 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int pos=0,neg=0;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                neg++;
            }else{
                pos++;
            }

        }
        Arrays.sort(arr);
        if(neg== arr.length){
            System.out.println(arr[arr.length-1]*arr[arr.length-2]);
        }else if(pos==arr.length ){
            System.out.println(arr[0]*arr[1]);
        }else{
            System.out.println(arr[0]*arr[arr.length-1]);
        }
    }
}
