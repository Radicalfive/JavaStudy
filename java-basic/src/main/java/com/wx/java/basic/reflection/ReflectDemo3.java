package com.wx.java.basic.reflection;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : radical
 * @description :反射解决泛型问题
 * @data : 2021/11/9
 **/
@Slf4j
public class ReflectDemo3 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException{
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        //list.add(18); //不是String，报错——> 下面通过反射解决这个问题

        Class<?> clazz = list.getClass();
        Method method = clazz.getMethod("add", Object.class);
        method.invoke(list,18);
        log.info("反射太强大了！！{}" , list);
    }
}
