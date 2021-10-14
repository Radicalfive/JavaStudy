package com.wx.java.basic.operator;
import lombok.extern.slf4j.Slf4j;

/**
 * 算术操作符示例
 * @author wx
 * @date :2021/9/28
 */

@Slf4j
public class MathOperatorDemo {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=25;
        int d=25;
        log.info("a+b="+(a+b));
        log.info("a-b="+(a-b));
        log.info("a*b="+(a*b));
        log.info("b/a="+(b/a));
        log.info("b%a="+(b%a));
        log.info("c%a="+(c%a));
        log.info("a++="+(a++));
        log.info("a--="+(a--));
        //查看d++与++d的不同（d++是在赋值后＋1，++d实在赋值前）
        log.info("d++ ="+(d++));
        log.info("++d ="+(++d));

    }
}
