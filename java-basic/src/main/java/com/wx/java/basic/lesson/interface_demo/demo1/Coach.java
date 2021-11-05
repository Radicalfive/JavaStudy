package com.wx.java.basic.lesson.interface_demo.demo1;

abstract class Coach extends Person{
    public Coach() {
    }
    public Coach(String name, int age) {
        super(name, age);
    }
    public abstract void teach();
}

