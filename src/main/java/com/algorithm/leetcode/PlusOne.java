package com.algorithm.leetcode;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int[] result = new int[digits.length + 1];
        for (int i = result.length - 1; i >= 0; i--) {
            int temp = (i > 0 ? digits[i - 1] : 0) + carry;
            if (temp <= 9) {
                result[i] = temp;
                carry = 0;
            } else {
                result[i] = 10 - temp;
                carry = 1;
            }
        }
        if (result[0] == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] digits = new int[]{8, 9, 9, 9};
        int[] result = plusOne(digits);
        System.out.println("result = " + JSON.toJSONString(result));
    }

}
