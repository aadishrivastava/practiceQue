package dev.lpa;

import java.util.Scanner;

public class Main357 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int s=sc.nextInt();
            int m=sc.nextInt();
            int[] l=new int[n];
            int[] r=new int[n];
            for (int i = 0; i < n; i++) {
                l[i]=sc.nextInt();
                r[i]=sc.nextInt();
            }
            System.out.println(AadiSolves(n,s,m,l,r));
        }
    }
    public static String AadiSolves(int n, int s, int m, int[] l, int[] r){
        if(l[0]>=s || m-r[n-1]>=s) {
            return "YES";
        }
        for (int i = 0; i < n-1; i++) {
            if(l[i+1]-r[i]>=s){
                return "YES";
            }
        }
        return "NO";
    }
}
