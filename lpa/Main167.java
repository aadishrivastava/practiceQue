package dev.lpa;
import java.util.*;
public class Main167 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println(-1);
            return;
        }

        for (int i = 1; i <= n; i += 2) {
            System.out.print((i + 1) + " " + i + " ");
        }
        System.out.println();
    }
}
 /*
 another way
 Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2!=0){
            System.out.println(-1);
            return;
        }
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        for(int i=0;i<n;i+=2){
            arr[i]=arr[i]^arr[i+1];
            arr[i+1]=arr[i]^arr[i+1];
            arr[i]=arr[i]^arr[i+1];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
  */