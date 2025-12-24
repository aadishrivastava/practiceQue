package dev.lpa;

import java.util.*;
public class Main310 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();

            System.out.println(AadiSolves(l,a,b));
        }
    }
    public static int AadiSolves(int l, int a, int b){
        int max=0;
        for (int i = 0; i < l; i++) {
            max=Math.max(max,(a+(i*b))%l);
        }
        return max;
    }
}
