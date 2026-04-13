package dev.lpa;

import java.util.HashMap;
import java.util.Scanner;

public class Main427 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[t];
        for (int i = 0; i < t; i++) {
            arr[i]=sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1 );
        }

        for(int i:arr){
            if(map.get(i)>1){
                System.out.println(i);
                return;
            }
        }
        System.out.println("No repeating element");
    }
}
