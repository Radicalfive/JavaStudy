package com.wx.java.basic.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args) {
        //通过getInstance方法获取Calendar的引用；
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(new Date());
        System.out.println("现在时间是："+new Date());
        //现在是那一年
        String year=String.valueOf(calendar.get(Calendar.YEAR));
        //现在是几月份
        String month=String.valueOf(calendar.get(Calendar.MONTH)+1);
        //现在是月份的第几天
        String day=String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
        //现在是星期几
        String week=String.valueOf(calendar.get(Calendar.DAY_OF_WEEK)-1);
        System.out.println("现在时间是："+year+"年"+month+"月"+day+"日，星期"+week);


        long year2016=calendar.getTimeInMillis();
        //这里与真实的月份之间相差1            //设置时间  （year,month,day）
        calendar.set(1989,9,26);
        long year1989=calendar.getTimeInMillis();
        long days=(year2016-year1989)/(1000*60*60*24);
        System.out.println("今天和1989年10月26日相隔"+days+"天，"+"也就是说我在这个美丽的星球上已经幸福的生活了"+days+"天。");

        //获取设置后的那天是当年中的第几天
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //获取设置后的那天是当月中的第几天
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //获取设置后的那天是当星期中的第几天
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
    }

}

