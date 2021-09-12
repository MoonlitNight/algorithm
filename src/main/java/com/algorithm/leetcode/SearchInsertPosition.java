package com.algorithm.leetcode;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums={16};
        int i = searchInsert(nums, 0);
        System.out.println("i = " + i);
    }

}
