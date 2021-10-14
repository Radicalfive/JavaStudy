package com.wx.java.basic.operator;

import lombok.extern.slf4j.Slf4j;
/**
 * 位操作符示例
 * @author wx
 * @date :2021/9/28
 */
@Slf4j
public class BitsOperatorDemo {
    public static void main(String [] args){
        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        log.info("a & b =" + c);

        c = a | b;
        log.info("a | b =" + c);

        c = a ^ b;
        log.info("a ^ b =" + c);

        c = ~a;
        log.info("~a = " + c);

        c = a << 2;
        log.info("a << 2 =" + c);

        c = a >> 2;
        log.info("a >> 2 =" + c);

        c = a >>> 2;
        log.info("a >>> 2 =" + c);
    }
}
