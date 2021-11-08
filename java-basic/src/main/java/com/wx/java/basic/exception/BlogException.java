package com.wx.java.basic.exception;

/**
 * @program: java-basic
 * @description
 * @author: radical
 * @create: 2021-11-07
 **/
public class BlogException extends RuntimeException{
    public BlogException(){

    }
    public BlogException(String message){
        super(message);
    }
}
