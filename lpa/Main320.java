package dev.lpa;

import java.util.LinkedHashMap;

public class Main320 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,4};
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for (int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int op=-1;
        for (Integer i:map.keySet()){
            if (map.get(i)==1){
                op=i;
                break;
            }
        }
        System.out.println(op);
    }
}
