package com.wx.java.basic.lesson.interface_demo.demo4;

public class Animal implements LiveAble{
    @Override
    public void eat(){
        System.out.println("动物吃东西");
    }

    @Override
    public void sleep() {
        System.out.println("动物睡觉");
    }
    @Override
    public void defaultMethod() {
        System.out.println("子类重写了默认方法");
    }
}
