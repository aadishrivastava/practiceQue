package dev.lpa;

import java.util.*;

public class Main224 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int k=in.nextInt();
            int[] arr=new int[n];
            int[] cost=new int[k];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            for(int i=0;i<k;i++){
                cost[i]=in.nextInt();
            }

            Arrays.sort(arr);
            Arrays.sort(cost);

            int i=n-1;
            int j=0;
            long tot=0;
            while(i>=0){
                if(j<k){
                    for(int idx=0;i>=0&&idx<cost[j];idx++,i--){
                        if(idx!=cost[j]-1){
                            tot+=arr[i];
                        }
                    }
                }else{
                    tot+=arr[i--];
                }
                j++;
            }
            System.out.println(tot);
        }
    }
}
