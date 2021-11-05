package com.wx.java.basic.generics;

/**@description 类型边界
 * @author radical
 * @date 2021/11/05
 */
public class GenericsExtendsDemo02 {
    static class A { /* ... */
    }
    interface B { /* ... */
    }
    interface C { /* ... */
    }
    static class D1 <T extends A & B & C> { /* ... */
    }
    // 编译报错
    //static class D2 <T extends B & A & C> { /* ... */
    // }
    static class E extends A implements B, C { /* ... */ }
    public static void main(String[] args) {
        D1<E> demo1 = new D1<>();
        System.out.println(demo1.getClass().toString());
        // 编译报错
        //D1<String> demo2 = new D1<>();
    }
}
