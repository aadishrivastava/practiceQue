package dev.lpa;

import java.util.HashMap;
import java.util.Scanner;

public class Main429 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            int a=sc.nextInt();
            if (a==0){
                arr[i]=-1;
            }else{
                arr[i]=1;
            }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int len=0;
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(map.containsKey(sum)){
                len=Math.max(i-map.get(sum),len);
            }
            map.putIfAbsent(sum,i);
        }
        System.out.println(len);

    }
}
