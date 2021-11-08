package com.wx.java.basic.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: java-basic
 * @description
 * @author: radical
 * @create: 2021-11-07
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Blog {
    private String id;
    private String title;
    private String  content;
    private List<Img> imgList;

}
