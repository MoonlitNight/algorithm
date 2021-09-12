package com.algorithm.leetcode;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int count = 0;
        boolean started = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if(!started && c == ' '){
                continue;
            }
            if(!started && c != ' '){
                started = true;
            }
            if (c != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = lengthOfLastWord("a");
        System.out.println("i = " + i);
    }
}
