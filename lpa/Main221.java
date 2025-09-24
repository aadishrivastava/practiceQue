package dev.lpa;

import java.util.Scanner;

public class Main221 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[m];
            for (int i = 0; i < m; i++) {
                arr[i]=sc.nextInt();
            }
            boolean strictlyIncreasing = true;
            for (int i = 1; i < m; i++) {
                if (arr[i] != arr[i - 1] + 1) {
                    strictlyIncreasing = false;
                    break;
                }
            }
            if (strictlyIncreasing) {
                int start = arr[0];
                int maxNeeded = start + m - 1;
                if (maxNeeded > n) {
                    System.out.println(0);
                } else {
                    System.out.println(n - maxNeeded + 1);
                }
            } else {
                int currentBlock = 1;
                boolean valid = true;
                for (int i = 1; i < m; i++) {
                    if (arr[i] == arr[i - 1] + 1) {
                        continue;
                    } else if (arr[i] == 1) {
                        currentBlock++;
                    } else {
                        valid = false;
                        break;
                    }
                }
                if (!valid || arr[m - 1] > n) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            }
        }
    }
}
