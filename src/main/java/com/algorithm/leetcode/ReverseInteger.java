package com.algorithm.leetcode;

/**
 * @author Jin Wang
 * @Date: 2021/9/11 09:24
 */
public class ReverseInteger {

    public static int reverse(int x) {
        int n = 0;
        while(x!=0){
            int temp=n*10+x%10;
            if(temp/10!=n){
                return 0;
            }
            n=temp;
            x=x/10;
        }
        return n;
    }

    public static void main(String[] args) {
        int reverse = reverse(-1111111002);
        System.out.println("reverse = " + reverse);
    }


}
