package com.algorithm.leetcode;

public class SqrtX {

    public static int mySqrt(int x) {
        long a = x;
        while (a * a > x) {
            a = (a + x / a) / 2;
        }
        return (int)a;
    }

    public static void main(String[] args) {
        int i = mySqrt(9);
        System.out.println("i = " + i);
    }


}
