package dev.lpa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main297 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Map<Character,Integer> map=new HashMap<>();
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for (int value: map.values()) {
            if(value!=2){
                count++;
            }
        }
        System.out.println(count>0?count-1:count);
    }
}
