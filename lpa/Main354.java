package dev.lpa;

import java.util.Scanner;

public class Main354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int s=sc.nextInt();
            int x=sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(AadiSolves(n,s,x,arr));
        }
    }
    public static String AadiSolves(int n, int s, int x, int[] arr){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        if (sum>s) {
            return "NO";
        } else if ((s-sum)%x==0) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
