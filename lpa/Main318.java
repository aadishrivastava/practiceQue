package dev.lpa;

import java.util.Scanner;

public class Main318 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String[] a=new String[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.next();
            }
            System.out.println(AadiSolves(a,n));
        }
    }
    public static StringBuilder AadiSolves(String[] a,int n){
        StringBuilder sb= new StringBuilder();
        sb.append(a[0]);
        for (int i = 1; i < n; i++) {

            if((sb+a[i]).compareTo(a[i]+sb)<=0){
                sb.append(a[i]);
            }else {
                sb.insert(0, a[i]);
            }
        }
        return sb;
    }
}
