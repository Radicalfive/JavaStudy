package com.wx.java.basic.lesson.interface_demo;

public class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("鼠标连上了");
    }

    @Override
    public void close() {
        System.out.println("鼠标断开了");
    }
}
