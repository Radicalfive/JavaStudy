package com.wx.java.basic.lesson.generic_paradigm;

import java.lang.annotation.Repeatable;

/**
 * @author : radical
 * @description :
 * @data : 2021/11/10
 **/
@Repeatable(Persons.class)
public @interface Person{
    String role() default "";
}
