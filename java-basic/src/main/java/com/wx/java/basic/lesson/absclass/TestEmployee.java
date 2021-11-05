package com.wx.java.basic.lesson.absclass;

/**
 * @author test
 * @date
 */
public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new JavaEE();
        employee.setId("1234");
        employee.setName("张三");
        System.out.println(employee);
        employee.work();
        System.out.println("****************");
        employee = new Android();
        employee.setId("3244");
        employee.setName("李四");
        System.out.println(employee);
        employee.work();
        System.out.println("****************");
        employee = new Hardware();
        employee.setId("2125");
        employee.setName("罗翔");
        System.out.println(employee);
        employee.work();
        System.out.println("****************");
        employee = new Network();
        employee.setId("2126");
        employee.setName("王二麻子");
        System.out.println(employee);
        employee.work();
    }
}
