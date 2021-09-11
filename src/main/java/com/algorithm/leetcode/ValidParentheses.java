package com.algorithm.leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='('){
                stack.push(')');
            }else  if(c=='['){
                stack.push(']');
            }else if(c=='{'){
                stack.push('}');
            }else{
                Character character = stack.size()>0?stack.pop():null;
                if(character==null || c!=character){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        boolean valid = isValid("()");
        System.out.println("valid = " + valid);
    }
}
