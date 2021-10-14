package com.wx.java.basic.operator;

import lombok.extern.slf4j.Slf4j;

/**
 * Instanceof示例
 * @author wx
 * @date :2021/9/28
 */
@Slf4j
public class InstanceofOperatorDemo {
    public static void main(String[] args){
        Animal anmial=new Cat();
        boolean result=anmial instanceof Cat;
        log.info(String.valueOf(result));
    }
    static class Animal{

    }
    static class Cat extends Animal{

    }
}
