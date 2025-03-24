package dev.lpa;

import java.util.Scanner;

public class Main24 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr= new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count=0;
            if(arr[i][0]%arr[i][1]==0){
                System.out.println(0);
                continue;
            } else if (arr[i][0]%arr[i][1]!=0) {
                if(arr[i][0]<arr[i][1]){
                    System.out.println(arr[i][1]-arr[i][0]);
                    continue;
                }else{
                    count=arr[i][1]-(arr[i][0]%arr[i][1]);
                    System.out.println(count);
                    continue;
                }
            }

        }

    }
}
