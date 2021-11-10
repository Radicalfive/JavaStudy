package com.wx.java.basic.lesson.generic_paradigm;

/**
 * @author : radical
 * @description :GreetingService
 * @data : 2021/11/10
 **/
@FunctionalInterface
public interface GreetingService {
    /**
     * 抽象⽅法
     *
     * @param message ⼊参
     */
    void sayMessage(String message);
}
