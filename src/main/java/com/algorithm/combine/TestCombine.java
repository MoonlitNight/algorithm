package com.algorithm.combine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author moonlight
 * @version 2018-06-11
 *
 */
public class TestCombine {

    /**
     * 递归组合算法
     * 选出 M 种组合
     * @param  arr 候选集合
     * @param  m 组合数
     * @param  index 索引
     * @param  combine 组
     * @param  result 组合结果
     */
    private static void recursiveCombine(List<String> arr,int m,int index,List<String> combine,List<List<String>> result){
        for (int i = index; i < arr.size()-m+1; i++) {
            if(m==0){
                result.add(combine);
                return;
            }
            List<String> temp = null;
            if(combine==null){
                temp = new ArrayList<>();
            }else{
                temp = Arrays.stream(combine.stream().toArray()).map(obj->obj.toString()).collect(Collectors.toList());
            }
            temp.add(arr.get(i));
            recursiveCombine(arr,m-1,i+1,temp,result);
        }
    }

    /**
     * 回溯组合算法
     * 选出 M 种组合
     * @param  arr 候选集合
     * @param  m 组合数
     */
    private static List<List<String>> backtrackingCombine(List<String> arr,int m){
        int n = arr.size();
        int index = 0;
        List<List<String>> result = new ArrayList<>();
        boolean flag = true;
        while (index<=n-m){
            if(flag){
                List<String> combineArr = new ArrayList<>();
                for (int i = index; i < m; i++) {
                    combineArr.add(arr.get(i));
                }
                flag = false;
                continue;
            }
            int cursor = index+m-1;

        }
        return null;
    }

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("黑");
        arr.add("白");
        arr.add("黄");
        arr.add("红");
//        arr.add("橙");
//        arr.add("蓝");
//        arr.add("绿");
//        arr.add("紫");
        List<List<String>> result = new ArrayList<>();
        recursiveCombine(arr,3,0,null,result);
        System.out.printf(result.toString());
    }
}
