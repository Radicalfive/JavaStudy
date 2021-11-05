package com.wx.java.basic.lesson.interface_demo.demo4;

/**
 * @description 生物
 * @author test
 * @date
 */
public interface LiveAble {
    /**
     * eat
     */
    void eat();
    /**
     * sleep
     */
    void sleep();
    /**
     * defaultMethod
     */
    default void defaultMethod(){
        System.out.println("接口中的默认方法");
    }
}
