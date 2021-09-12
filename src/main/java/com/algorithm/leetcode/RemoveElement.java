package com.algorithm.leetcode;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int right = 0, left = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int len = removeElement(nums, 2);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

}
