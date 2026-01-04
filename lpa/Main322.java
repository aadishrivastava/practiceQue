package dev.lpa;

import java.util.HashMap;

public class Main322 {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        System.out.println(twoSum(arr,target));
    }
    public static boolean twoSum(int[] arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.containsKey(target-(i*map.get(i)))){
                return true;
            }
        }
        return false;
    }
}
