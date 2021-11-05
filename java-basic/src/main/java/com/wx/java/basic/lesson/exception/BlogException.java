package com.wx.java.basic.lesson.exception;

/**
 * @author test
 * @date 2021/11/4
 */
public class BlogException extends RuntimeException{
    public BlogException(){

    }
    public BlogException(String Message){
        super(Message);
    }
}
