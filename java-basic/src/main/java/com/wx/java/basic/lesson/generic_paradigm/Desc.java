package com.wx.java.basic.lesson.generic_paradigm;

import java.lang.annotation.*;

/**
 * @author : radical
 * @description :
 * @data : 2021/11/10
 **/
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface Desc {
    enum Color {
        White, Grayish, Yellow
    }
    // 默认颜⾊是⽩⾊的
    Color c() default Color.White;
}
