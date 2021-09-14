package com.algorithm.leetcode;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int pre1 = 2, pre2 = 1;
        for (int i = 3; i <= n; i++) {
            int temp = pre1;
            pre1 = pre1 + pre2;
            pre2 = temp;
        }
        return pre1;
    }

    public static void main(String[] args) {
        int i = climbStairs(32);
        System.out.println("i = " + i);
    }

}
