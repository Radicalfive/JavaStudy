package com.wx.java.basic.lesson.generic_paradigm;

import com.wx.java.basic.lesson.TestAnnotation;

/**
 * @author : radical
 * @description :TestAnnotation1
 * @data : 2021/11/10
 **/
@TestAnnotation(id = 111, msg = "aaa")
public class TestAnnotation1 {
    public static void main(String[] args) {
        boolean hasAnnotation =
                TestAnnotation1.class.isAnnotationPresent(TestAnnotation.class);
        if (hasAnnotation) {
            TestAnnotation testAnnotation =
                    TestAnnotation1.class.getAnnotation(TestAnnotation.class);
            System.out.println("id:" + testAnnotation.id());
            System.out.println("msg:" + testAnnotation.msg());
        }
    }
}
