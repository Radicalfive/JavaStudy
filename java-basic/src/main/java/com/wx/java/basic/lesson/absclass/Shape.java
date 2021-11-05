package com.wx.java.basic.lesson.absclass;

/**
 * @author radical
 * @date
 */
public abstract class Shape {
    protected double x;
    protected double y;
    protected double z;
    protected double area;

    public Shape(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Shape(double z) {
        this.z = z;
    }

    public Shape() {

    }

    /**
     * 求面积
     * @return double
     */
    public abstract double getArea();

    public void show (){
        System.out.println(this.area);
    }

}
