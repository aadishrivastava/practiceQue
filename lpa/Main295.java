package dev.lpa;
import java.util.*;
public class Main295 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long r=sc.nextLong();
            long x=sc.nextLong();
            long d=sc.nextLong();
            int n=sc.nextInt();
            String s=sc.next();
            System.out.println(AadiSolves(r,x,d,n,s));
        }
    }
    public static int AadiSolves(long r, long x, long d, int n, String s){
        int count=0;
        char[] ch=s.toCharArray();
        for (int i = 0; i < n; i++) {
            char c=ch[i];
            if(c=='1'){
                count++;
                r=Math.max(0,r-d);
            }else{
                if(r<x){
                    count++;
                    r=Math.min(x-1,r+d);
                }
            }
        }
        return count;
    }
}
