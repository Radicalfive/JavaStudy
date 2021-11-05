package com.wx.java.basic.generics;

import java.util.ArrayList;
import java.util.List;

/**类型擦除
 * @author radical
 * @date 2021/11/05
 */
public class GenericsErasureTypeDemo {
    public static void main(String[] args) {
        List<Object> list1 = new ArrayList<Object>();
        List<String> list2 = new ArrayList<String>();
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
    }
}
