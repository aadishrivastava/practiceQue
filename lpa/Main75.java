package dev.lpa;

import java.util.Scanner;
public class Main75 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j < n; j++) {
                arr[j]=sc.nextInt();
            }
            if (arr[0] == arr[1] && arr[0] != arr[2]){
                System.out.println(3);
                continue;
            }
            if (arr[0] == arr[2] && arr[0] != arr[1]){
                System.out.println(2);
                continue;
            }
            if (arr[1] == arr[2] && arr[0] != arr[1]){
                System.out.println(1);
                continue;
            }
            for (int k = 3; k < n; k++)
                if (arr[k] != arr[k - 1]) {
                    System.out.println(k+1);
                    break;
                }
        }
    }
}
