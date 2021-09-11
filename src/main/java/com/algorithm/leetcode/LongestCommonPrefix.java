package com.algorithm.leetcode;

import java.util.Arrays;

/**
 * @author Jin Wang
 * @Date: 2021/9/11 10:35
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String result = strs[0];
        while (!strs[strs.length-1].startsWith(result)){
            result = result.substring(0,result.length()-1);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String s = longestCommonPrefix(strings);
        System.out.println("s = " + s);
    }
}
