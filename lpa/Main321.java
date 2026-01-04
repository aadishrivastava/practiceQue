package dev.lpa;

import java.util.HashSet;

public class Main321 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={1,2,3,1};
        System.out.println(containsDuplicates(arr1));
        System.out.println(containsDuplicates(arr2));
    }
    public static boolean containsDuplicates(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
