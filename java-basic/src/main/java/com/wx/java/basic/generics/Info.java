package com.wx.java.basic.generics;

public class Info<T> {

    private T value;
    public Info() { }
    public Info(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Info{" + "value=" + value + '}';
    }
}
