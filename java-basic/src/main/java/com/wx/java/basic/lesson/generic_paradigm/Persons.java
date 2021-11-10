package com.wx.java.basic.lesson.generic_paradigm;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : radical
 * @description :
 * @data : 2021/11/10
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Persons {
    Person[] value();
}
