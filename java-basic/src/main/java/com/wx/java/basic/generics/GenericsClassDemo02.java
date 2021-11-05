package com.wx.java.basic.generics;

/**@description 单类型参数的泛型类
 * @author radical
 * @date 2021/11/05
 */
public class GenericsClassDemo02 {
    public static void main(String[] args) {
        MyMap<Integer, String> map = new MyMap<>(1, "one");
        System.out.println(map);
    }
}
