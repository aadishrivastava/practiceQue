package dev.lpa;

import java.util.*;

public class Main292 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Set<Integer> set=new HashSet<>();
        int[] a=new int[n-k+1];
        int idx=0;
        while(idx<n-k+1){
            for (int end = idx; end < idx+k; end++) {
                set.add(arr[end]);
            }
            a[idx]=set.size();
            set.clear();
            idx++;
        }
        System.out.println(Arrays.toString(a));
    }
}
