package com.algorithm.leetcode;

/**
 * @author Jin Wang
 * @Date: 2021/9/13 20:42
 */
public class AddBinary {

    public static String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            return addBinary(b, a);
        }
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = a.length() - 1, j = b.length() - 1;
        while (i >= 0 || j >= 0) {
            if (i >= 0) carry += a.charAt(i--) - '0';
            if (j >= 0) carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry >>= 1;
        }
        String res = sb.reverse().toString();
        return carry > 0 ? '1' + res : res;
    }


    public static void main(String[] args) {
        String s = addBinary("0", "0");
        System.out.println("s = " + s);
    }


}
