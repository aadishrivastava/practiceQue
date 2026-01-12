package dev.lpa;

import java.util.Scanner;

public class Main332 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(AadiSolves(n,arr));
        }
    }
    public static String AadiSolves(int n,int[] arr){

        return arr[0]+arr[n-1]!=0?"Alice":"Bob";
    }
}
