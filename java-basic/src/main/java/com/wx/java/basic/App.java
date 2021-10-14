package com.wx.java.basic;

import com.wx.java.basic.array.ArrayDemo;

/**
 * @Description: APP
 * @author test
 * @data 2021/9/23
 */
public class App {
    public static void main(String[] args){
        System.out.println("app launch");
        int[]arr={1,2,3,4,5};
        ArrayDemo ad=new ArrayDemo();
        int sum=ad.getSum(arr);
        System.out.println("sum="+sum);
    }
 }
