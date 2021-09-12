package com.algorithm.leetcode;

public class ImplementStrStr {

    public static int strStr(String haystack, String needle) {
        if(haystack.length()==0){
            return needle.length()==0?0:-1;
        }
        if(haystack.equals(needle)){
            return 0;
        }
        for (int i = 0; i < haystack.length(); i++) {
            if(needle.length()==0){
                return 0;
            }
            int end= Math.min(i+needle.length(), haystack.length());
            if((end-i)!=needle.length()){
                return -1;
            }
            if(needle.equals(haystack.substring(i,end))){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = strStr("a", "a");
        System.out.println("i = " + i);
    }


}
