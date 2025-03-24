package dev.lpa;

import java.io.*;
import java.util.*;

public class Main68 {

    static int[] MataPita, Shrunkhala, Darja;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numSegments = Integer.parseInt(st.nextToken());

        // Create Union-Find structure
        MataPita = new int[10001]; // Maximum number of points (100 x 100)
        Shrunkhala = new int[10001];
        Darja = new int[10001];

        // Initialize the Union-Find structure
        for (int i = 0; i < 10001; i++) {
            MataPita[i] = i;
            Shrunkhala[i] = 0;
        }

        // Reading line segments and performing union-find
        for (int i = 0; i < numSegments; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken()), y2 = Integer.parseInt(st.nextToken());

            int p1 = encode(x1, y1);
            int p2 = encode(x2, y2);

            // Union the two points
            union(p1, p2);

            // Track the degree of each point
            Darja[p1]++;
            Darja[p2]++;
        }

        // Counting closed figures (cycle detection)
        int shapeCount = 0;
        boolean[] visited = new boolean[10001];
        for (int i = 0; i < 10001; i++) {
            int root = find(i);
            if (!visited[root] && Darja[root] == 2) {
                visited[root] = true;
                shapeCount++;
            }
        }

        // Output the result
        System.out.println(shapeCount);
    }

    // Encode the point (x, y) into a unique index
    static int encode(int x, int y) {
        return x * 101 + y; // Max x, y = 100, hence 101 ensures unique encoding
    }

    // Find function with path compression
    static int find(int x) {
        if (MataPita[x] != x) {
            MataPita[x] = find(MataPita[x]);
        }
        return MataPita[x];
    }

    // Union function with union by rank
    static void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            if (Shrunkhala[rootX] > Shrunkhala[rootY]) {
                MataPita[rootY] = rootX;
            } else if (Shrunkhala[rootX] < Shrunkhala[rootY]) {
                MataPita[rootX] = rootY;
            } else {
                MataPita[rootY] = rootX;
                Shrunkhala[rootX]++;
            }
        }
    }
}
