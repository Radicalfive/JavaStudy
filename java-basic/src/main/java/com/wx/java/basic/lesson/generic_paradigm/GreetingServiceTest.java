package com.wx.java.basic.lesson.generic_paradigm;

import org.junit.jupiter.api.Test;

/**
 * @author : radical
 * @description :
 * @data : 2021/11/10
 **/
public class GreetingServiceTest {
    @Test
    public void testGreetingService() {
        GreetingService greetingService = message ->
                System.out.println("Hello" + message);
        greetingService.sayMessage("Java工程师");
    }

}
