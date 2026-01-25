package dev.lpa;
import java.util.*;
public class Main356 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int query=sc.nextInt();
            int[] a=new int[n + 1];
            int[] b=new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i]=sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                b[i]=sc.nextInt();
            }
            int[] l=new int[query];
            int[] r=new int[query];
            for (int i = 0; i < query; i++) {
                l[i]=sc.nextInt();
                r[i]=sc.nextInt();
            }
            AadiSolves(n,query,a,b,l,r);
        }
    }
    public static void AadiSolves(int n, int query, int[] a, int[] b, int[] l, int[] r) {
        int[] sufOfB=new int[n+2];
        sufOfB[n]=b[n];
        for (int i = n - 1; i >= 1; i--) {
            sufOfB[i]=Math.max(b[i],sufOfB[i+1]);
        }
        long[] taken=new long[n+1];
        for (int i = 1; i <= n; i++) {
            taken[i]=Math.max(a[i],sufOfB[i]);
        }
        long[] preferred=new long[n+1];
        for (int i = 1; i <= n; i++) {
            preferred[i]=preferred[i-1]+taken[i];
        }
        for (int i = 0; i < query; i++) {
            int left=l[i];
            int right=r[i];
            long result=preferred[right]-preferred[left-1];
            System.out.print(result+" ");
        }
        System.out.println();
    }

}
