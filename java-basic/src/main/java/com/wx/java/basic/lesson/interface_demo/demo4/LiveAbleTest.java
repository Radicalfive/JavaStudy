package com.wx.java.basic.lesson.interface_demo.demo4;

public class LiveAbleTest {
    public static void main(String[] args) {
        LiveAble liveAble = new Animal();
        liveAble.eat();
        liveAble.sleep();
        liveAble.defaultMethod();

        liveAble = new People();
        liveAble.eat();
        liveAble.sleep();
    }
}
