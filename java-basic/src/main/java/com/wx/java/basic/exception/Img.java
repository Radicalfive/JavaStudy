package com.wx.java.basic.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @program: java-basic
 * @description
 * @author: wuying
 * @create: 2021-11-04 10:13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Img {
    private String id;
    private String url;
    private LocalDateTime createTime;
}
