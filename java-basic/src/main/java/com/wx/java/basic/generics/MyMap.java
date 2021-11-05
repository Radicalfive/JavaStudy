package com.wx.java.basic.generics;

/**
 * @author test
 * @param <K>
 * @param <V>
 */
public class MyMap<K,V> {
    private final K key;
    private final V value;
    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }
    @Override
    public String toString() {
        return "MyMap{" + "key=" + key + ", value=" + value + '}';
    }
}
