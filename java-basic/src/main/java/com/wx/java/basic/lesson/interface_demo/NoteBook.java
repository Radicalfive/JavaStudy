package com.wx.java.basic.lesson.interface_demo;

/**
 * @author test
 * @date
 */
public class NoteBook {
    private String band;
    private Integer size;
    

    public void start() {

        System.out.println("笔记本开机");
    }
    public void shutDown() {

        System.out.println("笔记本关机");
    }

    public void useUSB(USB usb) {
        usb.open();
        usb.close();
    }
}
