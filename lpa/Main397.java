package dev.lpa;

import java.util.*;

public class Main397 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long[] a=new long[n];
            ArrayList<Long> list=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextLong();
            }
            int[] ans=new int[n];
            for (int i = n-1; i >= 0; i--) {
                int left=0,right=list.size();
                while (left<right){
                    int mid=(left+right)/2;
                    if(a[i]>list.get(mid)){
                        left=mid+1;
                    } else {
                        right=mid;
                    }
                }
                int smaller=left;
                int l = 0, r = list.size();
                while (l < r) {
                    int mid = (l + r) / 2;
                    if (list.get(mid) <= a[i]) {
                        l = mid + 1;
                    } else {
                        r = mid;
                    }
                }
                int greater = list.size() - l;
                ans[i]=Math.max(smaller,greater);
                list.add(left,a[i]);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}
/*
int[] ans=new int[n];
            for (int i = 0; i < n; i++) {
                int smaller=0;
                int greater=0;
                for (int j = i+1; j < n; j++) {
                    if(a[j]<a[i]){
                        smaller++;
                    } else if (a[j]>a[i]) {
                        greater++;
                    }
                }
                ans[i]=Math.max(smaller,greater);
            }
            System.out.println(Arrays.toString(ans));
 */