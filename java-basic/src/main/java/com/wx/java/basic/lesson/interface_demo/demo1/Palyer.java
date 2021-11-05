package com.wx.java.basic.lesson.interface_demo.demo1;

abstract class Player extends Person{
    public Player() {
    }
    public Player(String name, int age) {
        super(name, age);
    }
    public abstract void train();
}
