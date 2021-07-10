package com.algorithm.base;

import com.alibaba.fastjson.JSON;

/**
 * <h3>算法导论第二章</h3>
 * <span>插入排序：降序排序</span>
 * @author moonlight
 *
 */
public class InsertionSortReverse{
    
    
    public static void main(String[] args){
        int[] arr = new int[] {3,1,7,4,9,12,10,33,5};
        insertionSort(arr);
        System.out.println(JSON.toJSONString(arr));
    }

    /**
     * 使用插入排序算法 对数组值进行排序
     * @param arr 排序数组
     */
    private static void insertionSort(int[] arr){
        //第一层循环 从第二个元素开始遍历 到最后一个元素
        for (int i = 1; i < arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0&&arr[j]<temp) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

}
