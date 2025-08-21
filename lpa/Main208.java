package dev.lpa;
import java.util.*;
public class Main208 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            int n=sc.nextInt();
            long k=sc.nextLong();
            long[] S=new long[n];
            for (int i = 0; i < n; i++) {
                long val=sc.nextLong();
                long mod=val%k;
                S[i]=Math.min(mod,k-mod);
            }
            long[] T=new long[n];
            for (int i = 0; i < n; i++) {
                long val=sc.nextLong();
                long mod=val%k;
                T[i]=Math.min(mod,k-mod);
            }
            Arrays.sort(S);
            Arrays.sort(T);
            System.out.println(Arrays.equals(S,T)?"YES":"NO");
        }
    }
}
