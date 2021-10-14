package com.wx.java.basic.operator;

import lombok.extern.slf4j.Slf4j;
/**
 * 逻辑操作符示例
 * @author wx
 * @date :2021/9/28
 */
@Slf4j
public class LogicalOperatorDemo {
    public static void main(String[] args){
        boolean a=true;
        boolean b=false;

        log.info("a&&b="+(a&&b));
        log.info("a||b="+(a||b));
        log.info("!(a&&b)="+!(a&&b));
    }
}
