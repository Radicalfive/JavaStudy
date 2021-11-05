package com.wx.java.basic.lesson.ex;

import javax.swing.*;
import java.awt.*;

/**
 * @description ：创建一个窗体
 * @author radical
 * @date 2021/10/21
 */
public class FrameDemo {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("第一个窗体");
        f.setSize(600 , 400);
        f.setBackground(Color.CYAN);
        f.setLocation(300 , 300);
        JTextField jTextField1 = new JTextField("请输入账号：");
        JButton jButton1 = new JButton("按钮1");
        JTextField jTextField2 = new JTextField("请输入密码");
        JButton jButton2 = new JButton("按钮2");
        JCheckBox jCheckBox = new JCheckBox("男", false);
        JCheckBox jCheckBox1 = new JCheckBox("女", false);

        f.setLayout(new FlowLayout(FlowLayout.CENTER , 10 ,10));
        f.add(jTextField1);
        f.add(jTextField2);
        f.add(jButton1);
        f.add(jButton2);
        f.add(jCheckBox);
        f.add(jCheckBox1);
        f.setVisible(true);
    }
}
