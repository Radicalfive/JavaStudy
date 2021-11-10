package com.wx.java.basic.lesson.collection.set;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;

/**
 * @author : radical
 * @description :SetDemo
 * @data : 2021/11/10
 **/
public class SetDemo1 {
    public static void main(String[] args) {
        Student[] students = {
                new Student(111,"我是熊大"),
                new Student(333,"我是张三"),
                new Student(222,"我是熊二"),
                new Student(444,"我是李四"),
        };
        Set<Student> set1 = new TreeSet<>(Arrays.asList(students));
        set1.forEach(System.out::println);

    }
}
