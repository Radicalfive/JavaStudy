package com.wx.java.basic.lesson;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Person {
    private String name;
    private Integer age;
    private Double height;

    public static void main(String[] args) {
        Person person1 = Person.builder()
                .name("TOM")
                .build();
        Person person2 = Person.builder()
                .name("TOM")
                .age(20)
                .build();
        Person person3 = Person.builder()
                .height(1.88)
                .name("TOM")
                .build();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
