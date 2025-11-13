package dev.lpa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main306 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int betweenX=n/2;
        int betweenY=m/2;
        int[][] grid=new int[n][m];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j]=sc.nextInt();
                max=Math.max(max,grid[i][j]);
            }
        }
        ArrayList<int[]> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j]==max){
                    list.add(new int[]{i,j});
                }
            }
        }
        int px=0;
        int py=0;
        int minDist=Integer.MAX_VALUE;
        for (int[] arr:list) {
            int dist=Math.abs(arr[0]-betweenX)+Math.abs(arr[1]-betweenY);
            if(dist<minDist){
                minDist=dist;
                px=arr[0];
                py=arr[1];
            }
        }
        System.out.println(minDist+" ("+px+","+py+")");
    }
}
