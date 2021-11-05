package com.wx.java.basic.lesson.interface_demo.demo3;

public class FlyAbleTest2 {
    public static void main(String[] args) {
        new FlyAble() {
            @Override
            public void fly() {
                System.out.println("某种神秘生物在飞行");
            }
        }.fly();
        new Plane().fly();
    }
}
