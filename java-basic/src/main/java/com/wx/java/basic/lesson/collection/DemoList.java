package com.wx.java.basic.lesson.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        List<String> list = new ArrayList<String>();
        list.add("betty");
        list.add("sweeney");
        list.add("钟");
        list.add("左");
        list1.add("星期一");
        list1.add("星期二");
        list1.add("星期三");
        System.out.println("list1：" + list1);
        list1.add(2,"星期天");
        System.out.println("list1：" + list1);

        List list2 = new ArrayList<>();
        list2.add(0,"周一");
        list2.add(1,"周二");
        list2.add(2,"周三");
        //移除list2中的元素
        System.out.println("移除元素前：" + list2);
        list2.remove(1);
        System.out.println("移除元素后：" + list2);
        //把list2元素插入到list1中索引位置为2处。
        Boolean b = list1.addAll(2,list2);
        System.out.println("list1：" + list1);
        System.out.println("list1集合是否发生变化：" + b);
        //将集合转换成数组
        Object[] obj = list.toArray();
        System.out.println(Arrays.toString(obj));
        int i = list1.indexOf("demo2");
        int j = list1.indexOf("你好");
        System.out.println("i=" + i +"\n" + "j=" +j);
        //list1中的元素长度
        var len1 = list1.size();
        System.out.println("list1的长度为：" + len1);
        //清楚list1数组中的元素
        list1.clear();
        System.out.println(list1);
        //判断数组是否为空，是否则返回true，反之返回false
        list2.isEmpty();
        //获取Iterator对象
        Iterator it = list2.iterator();
        //循环遍历Iterator对象
        while(it.hasNext()){
            //输出Iterator对象中的值
            System.out.println(it.next());
        }

    }
}
