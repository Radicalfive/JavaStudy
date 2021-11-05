package com.wx.java.basic.lesson.interface_demo.demo1;

class PpCoach extends Coach implements StudyEnglish{
    public PpCoach() {
    }
    public PpCoach(String name, int age) {
        super(name, age);
    }
    @Override
    public void studyEnglish() {
        System.out.println("乒乓球教练学习英语");
    }
    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }
}
