package com.algorithm.leetcode;

public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int result = nums[0], sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            result = Math.max(result, sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int sum = maxSubArray(nums);
        System.out.println("sum = " + sum);
    }

}
