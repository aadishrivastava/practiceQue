package dev.lpa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main305 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll("\\[|\\]","").trim();
        String[] str=s.split(",");
        int[] arr=new int[str.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(str[i].trim());
        }

        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);
            }
        }
    }
}
