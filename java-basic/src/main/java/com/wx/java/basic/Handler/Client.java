package com.wx.java.basic.Handler;

/**
 * @author : radical
 * @description :执行动态代理
 * @data : 2021/11/8
 **/
public class Client {
    public static void main(String[] args) {
        //真实角色
        UserService userService = new UserServiceImpl();
        //代理角色
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //通过条用程序处理角色来处理我们要调用的接口对象
        pih.setTarget(userService);
        UserService proxy = (UserService) pih.getProxy();
        proxy.update();
        proxy.add();
        proxy.delete();
        proxy.query();
    }
}
