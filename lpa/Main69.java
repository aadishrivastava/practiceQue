package dev.lpa;

import java.util.*;

public class Main69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[][] edges = new int[N][4];
        int bdaX = 0,bdaY=0;

        for (int i = 0; i < N; i++) {
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();
            edges[i][2] = scanner.nextInt();
            edges[i][3] = scanner.nextInt();
            bdaX= Math.max(bdaX, Math.max(edges[i][0], edges[i][2]));
            bdaY= Math.max(bdaY, Math.max(edges[i][1], edges[i][3]));
        }
        int max=Math.max(bdaX,bdaY)+1;
        int[] par = new int[max*max];
        int[] rank = new int[max*max];


        for (int i = 0; i < par.length; i++) {
            par[i] = i;
            rank[i] = 0;
        }

        int shape = 0;

        for (int[] segment : edges) {
            int x = segment[0] * max + segment[1];
            int y = segment[2] * max + segment[3];

            int rootX = x;
            while (rootX != par[rootX]) {
                par[rootX] = par[par[rootX]];
                rootX = par[rootX];
            }

            int rootY = y;
            while (rootY != par[rootY]) {
                par[rootY] = par[par[rootY]];
                rootY = par[rootY];
            }


            if (rootX == rootY) {
                shape++;
            } else {
                if (rank[rootX] > rank[rootY]) {
                    par[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    par[rootX] = rootY;
                } else {
                    par[rootY] = rootX;
                    rank[rootX]++;
                }
            }
        }

        System.out.println(shape);
    }
}

