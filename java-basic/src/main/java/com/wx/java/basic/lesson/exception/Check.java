package com.wx.java.basic.lesson.exception;

/**
 *接口
 */
public interface Check {
    /**
     *
     * @param blog
     * @return
     * @throws RuntimeException
     */
    boolean check(Blog blog) throws RuntimeException;
}
