package com.wx.java.basic.lesson.generic_paradigm;

import java.lang.annotation.Annotation;

/**
 * @author : radical
 * @description :
 * @data : 2021/11/10
 **/
public class TestMyAnnotation {
    public static void main(String[] args) {
        Annotation[] annotations = Man.class.getAnnotations();
        System.out.println(annotations.length);
        Persons p1 = (Persons) annotations[0];
        if(Man.class.isAnnotationPresent(Persons.class)) {
            Persons p2=Man.class.getAnnotation(Persons.class);
            for(Person t:p2.value()){
                System.out.println(t.role());
            }
        }
    }
}
