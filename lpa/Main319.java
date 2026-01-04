package dev.lpa;

import java.util.HashMap;
import java.util.Map;

public class Main319 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,1};
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for (Integer i:map.keySet()){
            System.out.println(i +" -> "+map.get(i));
        }
    }
}
