package com.wx.java.basic.generics;

/**@description 泛型方法
 * @author radical
 * @date 2021/11/05
 */
public class GenericsMethodDemo01 {
    public static <T> void printClass(T obj) {
        System.out.println(obj.getClass().toString());
    }
    public static void main(String[] args) {
        printClass("abc");
        printClass(10);
    }
}
