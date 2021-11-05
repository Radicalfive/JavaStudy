package com.wx.java.basic.lesson.absclass;

/**
 * 计算矩形的面积
 * @author test
 * @date
 */
public class Rectangle extends Shape{
    public Rectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public double getArea() {
        return this.x * this.y;
    }
}
