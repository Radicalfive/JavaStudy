package com.wx.java.basic.lesson.ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class MyDate extends Date {
    /**
     * 获得日历对象
     */
    private static void getGMT() {
        //获得日历对象
        Calendar cd = Calendar.getInstance();
        //创建格式化对象，指定本地语言
        DateFormat df = new SimpleDateFormat("EEE d MMM yyyy HH:mm:ss 'GMT' " , Locale.CHINA);
        //设置时区为东2区，北京时间为东8区
        df.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        //格式化后的时间
        System.out.println(df.format(cd.getTime()));
        System.out.println(System.currentTimeMillis());
    }
    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(this);
    }


    public static void main(String[] args) {
        MyDate myDate = new MyDate();
        System.out.println(myDate);
        MyDate.getGMT();

    }

}
