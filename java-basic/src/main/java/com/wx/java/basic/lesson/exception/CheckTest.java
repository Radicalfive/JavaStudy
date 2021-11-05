package com.wx.java.basic.lesson.exception;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.Collections;
/**
 * 测试类
 */
@Builder
public class CheckTest {
    public static void main(String[] args) {
        Img img = Img.builder()
                .id("1001")
                .url("F:\\pho\\1.png")
                .createTime(LocalDateTime.now())
                .build();
        Img img1 = Img.builder()
                .id("1002")
                .url("F:\\pho\\3.pdf")
                .createTime(LocalDateTime.now())
                .build();
        Blog blg = Blog.builder()
                .id("1001")
                .title("感烦烦烦的是")
                .text("暴力")
                .imgList(Collections.singletonList(img))
                .imgList(Collections.singletonList(img1))
                .build();
        Check impl = new Checkimpl();
        boolean result = impl.check(blg);
        System.out.println(result);
    }
}
