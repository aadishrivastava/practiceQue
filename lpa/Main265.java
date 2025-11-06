package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

public class Main265 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int oddCount=0;
            int evenCount=0;
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]%2==0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
            if(evenCount==0 || oddCount==0){
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]+" ");
                }
            }else{
                Arrays.sort(arr);
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
}
