package com.wx.java.basic.lesson.generic_paradigm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : radical
 * @description :
 * @data : 2021/11/10
 **/
public class Hero {
    @Deprecated
    public void say() {
        System.out.println("Honesty is always the best policy");
    }
    public void speak() {
        System.out.println("诚实总是上上策。");
    }
    public void addItems(String item) {
        List<String> items = new ArrayList<>();
        items.add(item);
        System.out.println("I am " + items);
    }
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.addItems("Java⼯程师");
        hero.say();
        hero.speak();
    }
}
