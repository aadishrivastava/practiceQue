package dev.lpa;

import java.util.Scanner;

public class Main433 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int sum=0;
        int l=0,ei=0;
        boolean flag=false;
        for (int r = 0; r < n; r++) {
            sum+=arr[r];
            while(sum>k){
                sum-=arr[l];
                l++;
            }
            if (sum==k){
                ei=r;
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println(-1);
        }else{
            System.out.println(l+" "+ei);
        }

    }
}
