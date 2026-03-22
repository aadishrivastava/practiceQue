package dev.lpa;

import java.util.*;

public class Main396 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            long c=sc.nextLong();
            long k=sc.nextLong();
            long[] a=new long[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextLong();
            }
            AadiSolves(n,c,k,a);
        }
    }
    public static void AadiSolves(int n, long c, long k, long[] a){
        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            if(c < a[i]) {
                break;
            }
            if(k > 0){
                long need = c - a[i];
                long use = Math.min(k, need);
                a[i] += use;
                k -= use;
            }
            c += a[i];
        }
        System.out.println(c);
    }
}
