package dev.lpa;

import java.util.*;

public class Main311 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }

            System.out.println(AadiSolves(n,a));
        }
    }
    public static int AadiSolves(int n,int[] a){
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        int dis=set.size();
        while(!set.contains(dis)){
            dis++;
        }
        return dis;
    }
}
