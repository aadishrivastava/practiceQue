package dev.lpa;
import java.util.*;
public class Main158 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long sum=0;
            for(int i=0;i<n;i++){

                sum+=sc.nextLong();
            }
            long sqrt=(long)Math.sqrt(sum);
            System.out.println(sqrt*sqrt==sum?"YES":"NO");
        }
    }
}
