package com.wx.java.basic.lesson.absclass;

/**
 *
 */
public class Circle extends Shape{
    public Circle() {
    }

    public Circle(double z) {
        super(z);
    }

    @Override
    public double getArea() {
        double result = Math.PI * this.z * this.z;
        super.area = result;
        return result;
    }
}
