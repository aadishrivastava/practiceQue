package dev.lpa;

import java.util.Scanner;

public class Main340 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] res=AadiSolves(n);
            for (int i = 0; i < n; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
    public static int[] AadiSolves(int n){
        int [] ans=new int[n];
        for (int i = 0; i < n; i++) {
            ans[i]=i+1;
        }
        return ans;
    }
}
