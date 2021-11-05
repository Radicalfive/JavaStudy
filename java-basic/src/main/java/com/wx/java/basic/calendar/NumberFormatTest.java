package com.wx.java.basic.calendar;

import java.text.NumberFormat;

public class NumberFormatTest {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.format(100000));
        String name="d100000";
        try {
            System.out.println(nf.parse(name));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
