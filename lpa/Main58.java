package dev.lpa;

public class Main58 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1};
        int count = 0;

        // First half: check if each element is greater than the next
        for (int i = 0; i < nums.length / 2; i++) {
            if (nums[i] >= nums[i + 1]) {
                count++;
            }
        }

        // Second half: check if each element is less than the next
        for (int i = nums.length / 2; i < nums.length - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}
