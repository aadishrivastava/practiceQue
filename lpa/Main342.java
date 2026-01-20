package dev.lpa;

import java.util.*;

public class Main342 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i]=sc.nextInt();
            }
            System.out.println(AadoSolves(arr));
        }
    }
    public static int AadoSolves(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for (int i:arr){
            set.add(i);
        }
        if(set.isEmpty()){
            return 1;
        }
        int[] res=new int[set.size()];
        int idx=0;
        for (Integer i:set){
            res[idx]=i;
            idx++;
        }
        Arrays.sort(res);
        int len=1,maxLen=1;
        for (int i = 0; i < res.length-1; i++) {
            if(res[i+1]-res[i]!=1){
                maxLen=Math.max(len,maxLen);
                len=1;
            }else{
                len++;
            }
        }
        return Math.max(len,maxLen);
    }
}
