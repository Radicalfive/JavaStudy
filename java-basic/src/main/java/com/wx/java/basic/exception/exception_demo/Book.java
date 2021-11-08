package com.wx.java.basic.exception.exception_demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    public String isbn;
    public String name;
    public String press;
    public float price;


}
