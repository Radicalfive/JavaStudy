package com.wx.java.basic.generics;

/**@description 类型边界
 * @author radical
 * @date 2021/11/05
 */
public class GenericsExtendsDemo01 {
    static <T extends Comparable<T>> T max(T x, T y, T z) {
        // 假设x是初始最⼤值
        T max = x;
        if (y.compareTo(max) > 0) {
            //y 更⼤
            max = y;
        }
        if (z.compareTo(max) > 0) {
            // 现在 z 更⼤
            max = z;
        }
        // 返回最⼤对象
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max(3, 4, 5));
        System.out.println(max(6.6, 8.8, 7.7));
        System.out.println(max("pear", "apple", "orange"));
    }
}
