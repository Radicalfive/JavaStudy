package com.wx.java.basic.lesson.absclass;

/**
 * @author test
 * @date
 */
public abstract class Employee {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 工作的抽象方法
     */
    public abstract void work();

    @Override
    public String toString() {
        return String.format("员工号为%s的%s员工" , this.id , this.name);
    }
}
