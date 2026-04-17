package dev.lpa;

import java.util.*;
public class Main436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            int total = p + 2*q;
            boolean done = false;
            for(int n=1; 2*(n*n+n)<=total; n++) {
                int m = (total - n) / (2*n + 1);
                if(n*(m+1) + m*(n+1) != total){
                    continue;
                }
                if(total - (m-n) >= 2*q) {
                    System.out.println(n+" "+m);
                    done = true;
                    break;
                }
            }
            if(!done){
                System.out.println(-1);
            }
        }
    }
}