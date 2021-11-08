package com.wx.java.basic.exception;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.Collections;

/**
 * @program: java-basic
 * @description
 * @author: radical
 * @create: 2021-11-07
 **/
@Builder
public class CheckTest {
    public static void main(String[] args) {

        Img img = Img.builder()
                .id("1001")
                .url("12323.png")
                .createTime(LocalDateTime.now())
                .build();
        Img img1 = Img.builder()
                .id("1002")
                .url("3.pdf")
                .createTime(LocalDateTime.now())
                .build();
        //正常数据
        Blog blg = Blog.builder()
                .id("1003")
                .title("王潇不会编程")
                .content("如困兽之斗")
                .imgList(Collections.singletonList(img))
                .build();
        //错误数据
        Blog blg1 = Blog.builder()
                .id("1004")
                .title("Winter is a season of recovery and preparation.\n" +
                        "冬日，宜养生蓄力。")
                //.title("")
                .content("暴力")
                .imgList(Collections.singletonList(img1))
                .build();

        CheckBlog send = new CheckImpl();
        boolean result = send.send(blg1);
        System.out.println(result);
    }
}
