package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main123 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();

            }
            Arrays.sort(arr);
            arr[0]=arr[0]+1;
            int gift=1;
            for (int i = 0; i < arr.length; i++) {
                gift*=arr[i];
            }
            System.out.println(gift);
        }
    }
}
