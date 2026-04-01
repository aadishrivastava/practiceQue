package dev.lpa;
import java.util.HashSet;
import java.util.Scanner;

public class Main407 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            HashSet<Integer> set=new HashSet<>();
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                set.add(arr[i]);
            }
            int extra=n - set.size();
            if(extra%2==0){
                System.out.println(n-extra);
            }else {
                System.out.println(n-extra-1);
            }

        }
    }
}