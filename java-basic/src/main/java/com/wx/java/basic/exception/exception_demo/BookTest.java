package com.wx.java.basic.exception.exception_demo;

import lombok.Builder;

import java.util.ArrayList;
import java.util.List;

@Builder
public class BookTest {
    public static void main(String[] args) {
        Book book1 = Book.builder()
                .isbn("radical")
                .name("古代文学")
                .press("人民大学出版社")
                .price(3000)
                .build();
        Book book2 = Book.builder()
                .isbn("b001")
                .name("离谱数学")
                .press("清华大学出版社11")
                .price(200)
                .build();
        Book book3 = Book.builder()
                .isbn("b003")
                .name("不会的概率")
                .press("南京大学出版社")
                .price(100)
                .build();
        List<Book> all=new ArrayList<>();
        all.add(book1);
        all.add(book2);
        all.add(book3);
        CheckBook checkBook = new CheckBookImpl();

        for (Book b:all) {
            try {
                boolean result = checkBook.checkbook(b);
                System.out.println(result);
            } catch (BookException e) {
                System.out.println(e.getMessage());
            }
            }
        }
    }
