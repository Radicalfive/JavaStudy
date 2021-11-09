package com.wx.java.basic.reflection;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author test
 * @date 2021/10.6
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class User {
    private Integer id;
    private String name;
}
