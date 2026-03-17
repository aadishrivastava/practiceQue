package dev.lpa;

import java.util.Scanner;

public class Main383 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            AadiSolves(n,arr);
        }

    }
    public static void AadiSolves(int n, int[] arr){
        boolean[] occupied=new boolean[n+2];
        occupied[arr[0]]=true;
        for (int i = 1; i < n; i++) {
            int seat=arr[i];
            if(!occupied[seat-1] && !occupied[seat+1]){
                System.out.println("NO");
                return;
            }
            occupied[seat]=true;
        }
        System.out.println("YES");
    }
}
