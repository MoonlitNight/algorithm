package com.algorithm.base;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * <span>快速排序</span>
 *
 * @author moonlight
 */
public class QuickSort {


    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 7, 4, 9, 12, 10, 33, 5};
        System.out.println(JSON.toJSONString(quickSort(arr)));
    }

    /**
     * 使用快速排序算法 对数组值进行排序
     *
     * @param arr 排序数组
     */
    private static int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int pivot = arr[0];
        int[] temp = Arrays.copyOfRange(arr, 1, arr.length);
        int[] less = quickSort(findArrayByCondition(temp, x -> x <= pivot));
        int[] greater = quickSort(findArrayByCondition(temp, x -> x > pivot));
        int[] result = new int[arr.length];
        if (less.length > 0) {
            System.arraycopy(less, 0, result, 0, less.length);
            result[less.length] = pivot;
        } else {
            result[0] = pivot;
        }
        if (greater.length > 0) {
            System.arraycopy(greater, 0, result, less.length > 0 ? less.length + 1 : 1, greater.length);
        }
        return result;
    }

    private static int[] findArrayByCondition(int[] arr, IntPredicate predicate) {
        return Arrays.stream(arr).filter(predicate).toArray();
    }

}
