package com.wx.java.basic.lesson.interface_demo.demo3;

public class FlyAbleTest {
    public static void main(String[] args) {
        /**
         * 1.赋值号右边：定义并创建该接口的子类对象
         * 2.赋值号左边：是多态，接口类型指向子类对象
         */
        FlyAble flyAble = new FlyAble() {
            @Override
            public void fly() {
                System.out.println("我会飞！！！");
            }
        };
        System.out.println(flyAble);
    }
}
