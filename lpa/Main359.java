package dev.lpa;

import java.util.Scanner;

public class Main359 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextInt();
            long b=sc.nextInt();
            long c=sc.nextInt();
            long[] ans=AadiSolves(a,b,c);
            System.out.println(ans[0]+" "+ans[1]+" "+ans[2]);
        }
    }
    public static long[] AadiSolves(long a, long b, long c){
        long[] ans=new long[3];
        long maxBC=Math.max(b,c);
        long maxAC=Math.max(a,c);
        long maxAB=Math.max(a,b);
        ans[0]=(a>maxBC)?0:(maxBC-a+1);
        ans[1]=(b>maxAC)?0:(maxAC-b+1);
        ans[2]=(c>maxAB)?0:(maxAB-c+1);
        return ans;
    }
}
