package com.wx.java.basic.array;

/**
 * @Description: 数组练习
 * @author test
 * @data 2021/9/23
 */

public class ArrayDemo {
    /**
     * 求数组元素的和
     *
     * @param array 整数型参数组
     * @return int:元素之和
     */
    public int getSum(int[] array){
        //sum为累加器,初始值为0
        int sum=0;

        for(int i =0;i<array.length;i++){
            sum +=i;
        }
        //返回sum
        return sum;
    }
}
