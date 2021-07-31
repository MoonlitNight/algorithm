package com.algorithm.leetcode;

public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        if (len % 2 == 1) {
            return findKThNum(nums1, 0, nums2, 0, (len + 1) / 2);
        }
        return (findKThNum(nums1, 0, nums2, 0, len / 2) + findKThNum(nums1, 0, nums2, 0, len / 2 + 1)) * 0.5;
    }

    public static int findKThNum(int[] nums1, int index1, int[] nums2, int index2, int key) {
        if (index1 >= nums1.length) return nums2[index2 + key - 1];
        if (index2 >= nums2.length) return nums1[index1 + key - 1];
        if (key == 1) {
            return Math.min(nums1[index1], nums2[index2]);
        }
        int n1 = (index1 + key / 2 - 1) < nums1.length ? nums1[index1 + key / 2 - 1] : Integer.MAX_VALUE;
        int n2 = (index2 + key / 2 - 1) < nums2.length ? nums2[index2 + key / 2 - 1] : Integer.MAX_VALUE;
        if (n1 <= n2) {
            return findKThNum(nums1, index1 + key / 2, nums2, index2, key - key / 2);
        } else {
            return findKThNum(nums1, index1, nums2, index2 + key / 2, key - key / 2);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1}, nums2 = new int[]{2, 3, 4, 5, 6};
        double medianSortedArrays = findMedianSortedArrays(nums1, nums2);
        System.out.println("medianSortedArrays = " + medianSortedArrays);
    }


}
