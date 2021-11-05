package com.wx.java.basic.lesson.collection;

import java.util.ArrayList;
import java.util.List;

/**数组练习
 * @author test
 * @date 2021/11/4
 */
public class DemoListAdd {
    public static void main(String[] args) {
        // 创建集合对象
        List<String> arrayList = new ArrayList<>();
        List<String> arrayList2 = new ArrayList<>();

        // 往集合的指定位置上添加给定的元素
        arrayList.add(0, "Index 0 元素");
        arrayList.add(1, "Index 1 元素");
        arrayList.add(2, "Index 2 元素");

        arrayList2.add(0, "Index 3 元素");
        arrayList2.add(1, "Index 4 元素");
        arrayList2.add(2, "Index 5 元素");

        System.out.println("现有元素:" + arrayList);

        System.out.println("移除元素前："+arrayList);
        arrayList.remove(1);
        System.out.println("移除元素后："+arrayList);

        arrayList.addAll(arrayList2);
        System.out.println("合并数组后："+arrayList);

        arrayList.clear();
        System.out.println("清空数组："+arrayList);

        arrayList.isEmpty();
        System.out.println(arrayList2.equals(1));

        arrayList.size();
        System.out.println(arrayList2.size());

    }
}

