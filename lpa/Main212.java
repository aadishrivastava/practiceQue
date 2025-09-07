package dev.lpa;
import java.util.*;
public class Main212 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        int rotate=nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=rotate;
        System.out.println(Arrays.toString(nums));
    }
}
