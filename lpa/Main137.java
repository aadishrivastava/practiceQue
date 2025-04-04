package dev.lpa;
import java.util.*;
public class Main137 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.print(Math.min(n,m)+" ");
            System.out.println(Math.max(n,m));

        }
    }
}
