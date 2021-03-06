package com.radical.netty.demo.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import com.radical.netty.demo.util.MsgUtil;

/**
 * @description: NettyClient
 * @author: radical
 * @date: 2021-11-02
 */
public class NettyClient {

    public static void main(String[] args) {
        new NettyClient().connect("127.0.0.1", 7397);
    }

    private void connect(String host, int port) {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap();
            b.group(workerGroup);
            b.channel(NioSocketChannel.class);
            b.option(ChannelOption.AUTO_READ, true);
            b.handler(new MyChannelInitializer());
            ChannelFuture f = b.connect(host, port).sync();
            System.out.println("Netty客户端启动成功！");

            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "尊敬的用户，欢迎您使用。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "你好，我这边时Netty服务器"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "使用protobuf通信格式的服务端，Netty很有用。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "使用protobuf通信格式的服务端，Netty很有用。"));
            f.channel().writeAndFlush(MsgUtil.buildMsg(f.channel().id().toString(), "使用protobuf通信格式的服务端，Netty很有用。"));

            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }
}