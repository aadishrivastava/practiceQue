package dev.lpa;


import java.util.Arrays;

public class Main216 {
    public static void main(String[] args) {
        int[] arr={1,4,3,2};
        System.out.println(Arrays.toString(nextPermutation(arr)));
    }
    public static int[] nextPermutation(int[] nums){
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=nums.length-1;
            while (nums[j]<=nums[i]){
                j=j-1;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }

        reverse(nums, i + 1, nums.length - 1);
        return nums;
    }
    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
