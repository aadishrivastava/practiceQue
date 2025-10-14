package dev.lpa;
import java.util.*;
public class Main233 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] b=new long[n];
            for (int i = 0; i < n; i++) {
                b[i]=sc.nextLong();
            }

            long[] a=new long[n];
            a[0]=1;
            long next=2;
            for (int i = 1; i < n; i++) {
                long diff=b[i]-b[i-1];
                if(diff==i+1){
                    a[i]=next;
                    next++;
                }else{
                    a[i]=a[i-(int)diff];
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }
}
