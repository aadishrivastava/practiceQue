package dev.lpa;
import java.util.*;
public class Main424 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxFreq=Integer.MIN_VALUE;
        int secMaxFreq=Integer.MIN_VALUE;
        for(int i:map.keySet()){
            int currFreq=map.get(i);
            if(currFreq>maxFreq){
                secMaxFreq=maxFreq;
                maxFreq=currFreq;
            } else if (currFreq>secMaxFreq && currFreq<maxFreq) {
                 secMaxFreq=currFreq;
            }
        }
        for (int i:map.keySet()){
            if (map.get(i)==secMaxFreq){
                System.out.println(i);
                return;
            }
        }
        System.out.println("No such element");


    }
}
