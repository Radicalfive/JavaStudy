package com.wx.java.basic.array;

import lombok.extern.slf4j.Slf4j;

/**
 * author:radical
 * data:2021/10.4
 */
@Slf4j
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {11,23,44,325,66,76};
        SelectSort(arr);
    }

    public static void SelectSort(int [] arr) {
        for(int i =0; i< arr.length-1;i++){
            for (int j = i+1 ; j < arr.length;j++){
                if(arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for (int j : arr){
            log.info(j + "");
        }
    }
}
