package com.wx.java.basic.serialize;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * @description: Student类
 * @author: radical
 * @date: 2021/10/18
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -4392658638228508589L;

    /**
     * 判断控制
     * @param objectInputStream 对象输流
     * @throws IOException 异常
     * @throws ClassNotFoundException 异常
     */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        //调用默认的反序列化函数
        objectInputStream.defaultReadObject();
        //手工检查反序列化后学生成绩的有效性,若发现有问题，即终止操作
        if (0 > score || 100 < score) {
            throw new IllegalArgumentException("学生分数中能在0-100之间！");
        }
    }
    private String name;
    private Integer age;
    private Integer score;
    private transient String passwd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }




    @Override
    public String toString() {
        return "Student:" + '\n' +
                "name = " + this.name + '\n' +
                "age = " + this.age + '\n' +
                "score = " + this.score + '\n'+
                "passwd = " + this.passwd + '\n'
                ;
    }

}