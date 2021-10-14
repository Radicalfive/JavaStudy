package com.wx.java.basic.array;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * 直接插入排序
 *
 * @author:radical
 * data:2021/10.4
 */
@Slf4j
public class InsertSort {
    public static void main(String[] args) {
        int [] arr = {3,5,7,2,9,6,8,1};
        log.info("排序之前：{}"+ Arrays.toString(arr));
        //调用直接插入排序
        InsertSort(arr);
        log.info("排序之后：{}"+ Arrays.toString(arr));
    }

    public static void InsertSort(int[] arr) {
        //已排序数组的下标
        int j;
        //待排序的元素
        int t;
        for (int i=1 ; i<arr.length ; i++){
            if (arr[i]<arr[i-1]){
                //赋值给待排序元素
                t = arr[i];
                for (j = i - 1; j >= 0 && arr[j] > t ; j--){
                    //从后往前遍历，逐个和待排序元素比较，如果已排序元素较大，则将它后移
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = t;
            }
        }
    }
}
