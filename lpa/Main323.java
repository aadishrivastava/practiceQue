package dev.lpa;

import java.util.HashMap;

public class Main323 {
    public static void main(String[] args) {
        int[] arr={1,-1,5,-2,3};
        int k=3;
        System.out.println(longestSubArray(arr,k));
    }
    public static int longestSubArray(int[] arr, int k){
        int sum=0;
        int maxLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                maxLen=Math.max(maxLen,i-map.get(sum-k));
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
