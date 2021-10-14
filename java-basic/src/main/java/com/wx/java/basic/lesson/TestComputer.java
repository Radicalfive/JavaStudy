package com.wx.java.basic.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestComputer {

    public static void main(String[] args) throws IOException {
        Computer pc = new Computer("Mac","grey","intel","16G","512G",8888.9,"开机");
        //从键盘通过输入流接受数据
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        while (true){
            System.out.println("请输入0-4");
            String choice = br.readLine();
            switch (choice){
                case "1" :{
                    System.out.println(pc.getBand());
                    break;
                }
                case "2" :{
                    System.out.println(pc.getPrice());
                    break;
                }
                case "3" :{
                    pc.start();
                    break;
                }
                case "4" :{
                    pc.off();
                    break;
                }
                default:
                    break;
            }
        }

    }
}

