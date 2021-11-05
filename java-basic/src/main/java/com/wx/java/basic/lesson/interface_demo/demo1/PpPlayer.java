package com.wx.java.basic.lesson.interface_demo.demo1;

class PpPlayer extends Player implements StudyEnglish{
    public PpPlayer() {
    }
    public PpPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void studyEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }
    @Override
    public void train() {
        System.out.println("乒乓球运动员训练");
    }
}
