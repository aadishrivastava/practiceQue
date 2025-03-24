package dev.lpa;

import java.util.Scanner;

public class Main56 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]= sc.nextInt();
        }

        System.out.print(sortingNum(nums));


    }
    public static int sortingNum(int[] nums){
        int current=0;
        boolean flag =true;
        for (int i = 0; i < nums.length-1; i+=2) {
            if(nums[i]==nums[i+1]){
                flag=true;
            }else{
                flag=false;
                current=nums[i];
                break;
            }
        }
        return current;
    }
}
