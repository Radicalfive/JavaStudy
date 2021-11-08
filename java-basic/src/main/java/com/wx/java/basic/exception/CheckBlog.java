package com.wx.java.basic.exception;

/**
 * @program:
 * @description
 * @author: radical
 * @create: 2021-11-07
 **/
public interface CheckBlog {
    /**
     * @param blog
     * @return
     * @throws BlogException
     */
    boolean send(Blog blog) throws BlogException;
}