package dev.lpa;

import java.util.Scanner;

public class Main231 {
    static final int M=676767677;
    static boolean f(int k,int n,int[] d){
        int p=0;
        if(k<0||k>n)
            return false;
        for(int i=1;i<=n;i++){
            int q=k+d[i]-p;
            if(q-p!=0&&q-p!=1)
                return false;
            if(q<0||q>i)
                return false;
            p=q;
        }
        return p==k;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int T=sc.nextInt();T>0;T--){
            int n=sc.nextInt();
            int[] x=new int[n+1],y=new int[n+1];
            for(int i=1;i<=n;i++)
                x[i]=sc.nextInt();
            for(int i=1;i<=n;i++)
                y[i]=x[i]-(n-i+1);
            long out=0;
            int a=-y[1],b=1-y[1];
            if(f(a,n,y))
                out++;
            if(a!=b&&f(b,n,y))
                out++;
            System.out.println(out%M);
        }
    }
}
