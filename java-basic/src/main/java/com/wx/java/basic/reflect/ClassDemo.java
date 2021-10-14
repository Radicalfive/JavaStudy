package com.wx.java.basic.reflect;

import lombok.extern.slf4j.Slf4j;

/**
 * Java反射值Class类的练习
 * 在面向对象的语言中，万事万物皆对象，那么类时谁的对象呢
 * 类的类型是class
 * 反射机制，欲获取一个类或者调用某个类的方法，首先要获取到该类的Class对象
 * @author test
 * @date 2021/10/6
 */
@Slf4j
public class ClassDemo {
    public static void main(String[] args) {
        //在JAVA API 中，提供了获取Class类对象的三种方法

        //第一种，使用Class.forName 静态方法。前提：已经明确类的全路径名
        Class clazz1 = null;
        try {
            clazz1 = Class.forName("com.wx.java.basic.reflect.User");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        //第二种，使用.class方法。说明：仅适合在编译前就已经明确要操作的Class
        Class clazz2 = User.class;

        //第三种，使用类对象的getClass() 方法。适合有对象实例的情况下
        User user = new User();
        Class clazz3 = user.getClass();

        //结果
        log.info("clazz1——clazz2——clazz3:{},{},{}" , clazz1 , clazz2 , clazz3);
        log.info(String.valueOf(clazz1 == clazz2));
        log.info(String.valueOf(clazz2 == clazz3));
    }
}
