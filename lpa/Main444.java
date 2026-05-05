package dev.lpa;

import java.util.*;

public class Main444 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int f=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int favNum=a[f-1];
            Arrays.sort(a);
            reverse(a);

            int count=0;
            for(int i=0;i<n;i++){
                if (a[i]==favNum){
                    count++;
                }
            }
            int res=count;
            for (int i = 0; i < k; i++) {
                if (a[i]==favNum){
                    count--;
                }
            }
            if (count==0){
                System.out.println("YES");
            } else if (count==res) {
                System.out.println("NO");
            }else if (count>0){
                System.out.println("MAYBE");
            }
        }
    }
    public static void reverse(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
}
