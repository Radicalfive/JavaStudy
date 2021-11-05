package com.wx.java.basic.lesson.interface_demo.demo1;

class BasketballPlayer extends Player{
    public BasketballPlayer() {
    }
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void train() {
        System.out.println("篮球运动员训练");
    }
}
