package com.algorithm.leetcode;

/**
 * @author Jin Wang
 * @Date: 2021/9/11 10:17
 */
public class Roman2Integer {

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = switchRoman(s.charAt(i));
            int next=i+1<s.length()?switchRoman(s.charAt(i+1)):0;
            if(next>current){
                sum-=current;
            }else{
                sum+=current;
            }
        }
        return sum;
    }

    private static int switchRoman(char c){
        switch (c){
            case 'I':return 1;
            case 'V':return 5;
            case 'X':return 10;
            case 'L':return 50;
            case 'C':return 100;
            case 'D':return 500;
            case 'M':return 1000;
            default: throw new RuntimeException("char="+c+" not support.");
        }
    }

    public static void main(String[] args) {
        int mcmxciv = romanToInt("MCMXCIV");
        System.out.println("mcmxciv = " + mcmxciv);
    }


}
