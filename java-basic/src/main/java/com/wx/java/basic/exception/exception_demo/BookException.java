package com.wx.java.basic.exception.exception_demo;

public class BookException extends RuntimeException{
    public BookException() {
    }

    public BookException(String message) {
        super(message);
    }
}
