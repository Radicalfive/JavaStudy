package com.wx.java.basic.lesson.interface_demo.demo1;

class BasketballCoach extends Coach{
    public BasketballCoach() {
    }
    public BasketballCoach(String name, int age) {
        super(name, age);
    }
    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }
}
