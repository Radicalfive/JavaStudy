package com.wx.java.basic.oop;

import lombok.Data;

@Data
class Address implements Cloneable{
    private Integer id;
    private String describe;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
@Data
class Student1 implements Cloneable{
    private Integer id;
    private String name;
    private Address address;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //浅拷贝
        return super.clone();

    }
    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //    //浅拷贝
    //    Student1 s = (Student1) super.clone();
    //    s.address = (Address) this.address.clone();
    //    return s;
    //}
}
