package dev.lpa;
import java.util.*;
public class Main182 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int w=sc.nextInt();
            int h=sc.nextInt();
            int n=sc.nextInt();
            long count=1;

            while(w%2==0){
                w/=2;
                count*=2;
            }
            while(h%2==0){
                h/=2;
                count*=2;
            }
            System.out.println(count>=n?"YES":"NO");
        }
    }
}

