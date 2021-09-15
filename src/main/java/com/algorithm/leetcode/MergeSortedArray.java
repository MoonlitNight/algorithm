package com.algorithm.leetcode;

import com.alibaba.fastjson.JSON;

/**
 * @author Jin Wang
 * @Date: 2021/9/15 22:37
 */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m-- + n-- - 1;
        while (n >= 0) {
            nums1[index--] = m >= 0 && (nums1[m] >= nums2[n]) ? nums1[m--] : nums2[n--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println("nums1 = " + JSON.toJSONString(nums1));
    }

}
