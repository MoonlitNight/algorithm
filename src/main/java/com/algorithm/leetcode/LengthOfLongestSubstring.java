package com.algorithm.leetcode;

import java.util.BitSet;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int[] bits = new int[128];
        for (int i = 0; i < bits.length; i++) {
            bits[i] = -1;
        }
        int result = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            // 如果字符重复出现，则向右移动左指针
            left = Math.max(left, bits[c] + 1);
            result = Math.max(result, right - left + 1);
            bits[c] = right;
        }
        return result;
    }


    public static void main(String[] args) {
        int i = lengthOfLongestSubstring("abba");
        System.out.println("i = " + i);
    }
}
