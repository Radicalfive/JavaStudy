package com.wx.java.basic.exception.exception_demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckBookImpl implements CheckBook{
    private static final String [] arr={"血腥","杀戮","残忍"};
    @Override
    public boolean checkbook(Book book) throws BookException{

        String pattern = "^b.{3}";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(book.getIsbn());
        if (m.find()!=true){
            throw new BookException("序列号错误");
        }
        //书名
        // 要求：书名不能出现违禁词
        for (String s :
                arr) {
            if (book.getName().contains(s)){
                throw new BookException("书名有禁词");
            }
        }
        //出版社：
        // 要求：后3位必须是出版社
        if (book.getPress().substring(book.getPress().lastIndexOf("出")).equals("出版社")==false){
            throw new BookException("请输入正确的出版社");
        }
        //价格：
        // 要求：大于0，小于1000
        if (book.getPrice()<0 || book.getPrice()>1000){
            throw new BookException("价格输入不正确");
        }
        return true;
    }
    }

