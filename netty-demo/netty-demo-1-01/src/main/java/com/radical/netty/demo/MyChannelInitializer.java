package com.radical.netty.demo;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @description: MyChannelInitializer
 * @author: radical
 * @date: 2021/10/30
 */
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) {

        System.out.println("连接报告开始");
        System.out.println("连接报告信息：有一客户端链接到本服务端");
        System.out.println("连接IP:" + channel.localAddress().getHostString());
        System.out.println("连接Port:" + channel.localAddress().getPort());
        System.out.println("连接报告完毕");
    }

}
