package dev.lpa;

import java.util.*;

public class Main391 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[][] arr=new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j]=sc.nextInt();
                }
            }
            AadiSolves(n,arr);

        }
    }
    public static void AadiSolves(int n, int[][] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map.put(arr[i][j],map.getOrDefault(arr[i][j],0)+1);
            }
        }

        for(Integer i:map.keySet()){
            if(map.get(i)>n*(n-1)){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
