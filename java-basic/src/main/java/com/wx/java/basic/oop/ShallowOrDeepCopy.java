package com.wx.java.basic.oop;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ShallowOrDeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setId(1);
        student.setName("wx");
        Address address = new Address();
        address.setId(101);
        address.setDescribe("江苏南京");
        student.setAddress(address);

        Student cloneStudent = (Student) student.clone();
        log.info("*******************浅拷贝or深拷贝************************");
        log.info("student == cloneStudent: {}" , student == cloneStudent);
        log.info("二级对象内容: {} " , student.getAddress() == cloneStudent.getAddress());
        log.info("二级对象中内容: {}" , student.getAddress().getDescribe() == cloneStudent.getAddress().getDescribe());

        log.info("*********************修改属性前*************************");
        log.info(student.toString());
        log.info(cloneStudent.toString());
        student.setName("王潇");
        address.setDescribe("甘肃庆阳");
        log.info("*********************修改属性前后*************************");
        log.info(student.toString());
        log.info(cloneStudent.toString());

    }
}
