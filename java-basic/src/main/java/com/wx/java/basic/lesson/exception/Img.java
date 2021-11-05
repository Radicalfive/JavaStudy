package com.wx.java.basic.lesson.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Img {
    private String id;
    private String url;
    private LocalDateTime createTime;
}
