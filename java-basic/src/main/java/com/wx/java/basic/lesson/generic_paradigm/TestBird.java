package com.wx.java.basic.lesson.generic_paradigm;

/**
 * @author : radical
 * @description :
 * @data : 2021/11/10
 **/
public class TestBird {
    public static void main(String[] args) {
        Bird bird = BirdNest.Sparrow.reproduce();
        Desc.Color color = bird.getColor();
        System.out.println("Bird's color is :" + color);
    }
}
