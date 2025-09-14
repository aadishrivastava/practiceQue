package dev.lpa;

import java.util.*;
public class Main215 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x+y>=n+1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}