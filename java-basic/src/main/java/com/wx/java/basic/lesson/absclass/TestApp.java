package com.wx.java.basic.lesson.absclass;

/**
 * 测试
 * @author test
 * @date
 */
public class TestApp {
    public static void main(String[] args) {
        //多态
        TestAbstract ta = new Test01();
        ta.run();
        ta = new Test02();
        ta.run();
    }
}
