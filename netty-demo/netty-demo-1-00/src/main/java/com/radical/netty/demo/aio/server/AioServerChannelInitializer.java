package com.radical.netty.demo.aio.server;

import com.radical.netty.demo.aio.ChannelInitializer;

import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

/**
 * @description: 服务端初始化
 * @author: mqxu
 * @date: 2021/10/30
 */
public class AioServerChannelInitializer extends ChannelInitializer {

    @Override
    protected void initChannel(AsynchronousSocketChannel channel) throws Exception {
        channel.read(ByteBuffer.allocate(1024), 10, TimeUnit.SECONDS, null, new AioServerHandler(channel, StandardCharsets.UTF_8));
    }

}
