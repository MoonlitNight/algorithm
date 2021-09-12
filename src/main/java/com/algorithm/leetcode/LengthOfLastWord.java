package com.algorithm.leetcode;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else if (count != 0) {
                return count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = lengthOfLastWord("a");
        System.out.println("i = " + i);
    }
}
