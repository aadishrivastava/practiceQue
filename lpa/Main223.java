package dev.lpa;

import java.util.Scanner;

public class Main223 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[] arr=new int[n];
            int[] count=new int[3];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
                if(arr[i]==-1){
                    count[0]++;
                } else if (arr[i]==0) {
                    count[1]++;
                }else{
                    count[2]++;
                }
            }
            int ans=0;
            int zeros=count[1];
            int neg=count[0];
            ans+=zeros;
            if(neg%2!=0){
                ans+=2;
            }
            System.out.println(ans);
        }
    }
}
