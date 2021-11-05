package com.wx.java.basic.lesson.interface_demo;

/**
 * 测试类
 */
public class USBTest {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        noteBook.start();
        noteBook.useUSB(new Mouse());
        noteBook.useUSB(new Keyborad());
        noteBook.shutDown();
    }
}
