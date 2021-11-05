package com.wx.java.basic.generics;

/**@description: 泛型接口：实现接口的子类明确声明泛型类型
 * @author radical
 * @date 2021/11/05
 */
public class GenericsInterfaceDemo01 {
    private final int text;
    public GenericsInterfaceDemo01(int text) {
        this.text = text;
    }
    public Integer text() {
        return text;
    }
    public static void main(String[] args) {
        GenericsInterfaceDemo01 demo = new GenericsInterfaceDemo01(10);
        System.out.print(demo.text());
    }
}
