package com.wx.java.basic.lesson.interface_demo.demo2;

public class Student {
    private String name;
    private Integer age;
    /**
     * @author radical
     * 类变量，记录学生的学校
     */
    static String schoolName = "NJUIT";

    public Student(String name , Integer age ) {
        this.name = name;
        this.age = age;

    }
    public void test() {
        System.out.println(schoolName);
        show();
        System.out.println(this.name);
    }
    public static void show() {
        System.out.println("hello");
        //System.out.println(name);
        //test();
    }
    public static void main(String[] args) {
        show();
        System.out.println(schoolName);
    }
}
