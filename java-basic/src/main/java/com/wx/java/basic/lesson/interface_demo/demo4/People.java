package com.wx.java.basic.lesson.interface_demo.demo4;

/**
 * @author test
 * @date
 */
public class People implements LiveAble{
    @Override
    public void eat() {
        System.out.println("人吃东西!");
    }

    @Override
    public void sleep() {
        System.out.println("人睡觉");
    }

}
