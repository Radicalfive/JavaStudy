package com.wx.java.basic.lesson.interface_demo;

/**
 * 键盘
 */
public class Keyborad implements USB{

    @Override
    public void open() {
        System.out.println("键盘连上了");
    }

    @Override
    public void close() {
        System.out.println("键盘断开了");
    }
}
