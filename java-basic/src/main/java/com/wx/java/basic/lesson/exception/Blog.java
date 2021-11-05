package com.wx.java.basic.lesson.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author test
 * @date 2021/11/4
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Blog {
    private String id;
    private String title;
    private String text;
    private List<Img> imgList;

}