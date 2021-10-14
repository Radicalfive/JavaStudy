package com.wx.java.basic.variable;

import lombok.extern.slf4j.Slf4j;

@Slf4j

public class VariableDemo {

    /**
     * 类变量（静态变量）
     */
    private static int staticVar=1024;

    /**
     * 实例变量
     */
    private String instanceVar="hello";

    /**
     * 实例方法
     */
    public void meehod(){
        //局部变量
        int localVar=666;
        log.info("localVar before:{}",localVar);
        localVar=888;
        log.info("localVar after:{}",localVar);
    }
    /**
     * 静态方法
     * @param args
     */
    public static void main(String[] args){
        //访问类变量（静态变量），无需实例化对象
        log.info("staticVar before:{}",staticVar);
        staticVar=2048;
        log.info("staticVar after:{}",staticVar);
        //System.out.println("*****************");
        //创建实例对象，访问实例变量
        VariableDemo vd=new VariableDemo();
        log.info("instanceVar before:{}",vd.instanceVar);
        vd.instanceVar="world";
        log.info("instanceVar after:{}",vd.instanceVar);
        //System.out.println("*****************");
        //调用实例方法
        vd.meehod();
    }

}
