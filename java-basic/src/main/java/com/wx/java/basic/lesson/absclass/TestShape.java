package com.wx.java.basic.lesson.absclass;

/**
 * @author test
 * @date
 */
public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Circle(3.5);
        shape.getArea();
        //
        System.out.println(shape.area);
        System.out.println(shape.getArea());
        shape = new Rectangle(4,7);
        System.out.println(shape.getArea());
    }
}
