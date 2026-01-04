package dev.lpa;

import java.util.HashSet;

public class Main324 {
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        int count=1;
        int maxCount=0;
        for (int j : arr) {
            set.add(j);
        }
        for (Integer i:set){
            int curr=i;
            if(!set.contains(curr-1)){
                while(set.contains(curr+1)){
                    curr=curr+1;
                    count++;
                }
            }
            maxCount= Math.max(maxCount,count);
            count=1;
        }
        return maxCount;
    }
}
