package com.radical.netty.demo.aio;

import com.radical.netty.demo.aio.server.AioServer;

import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;

/**
 * @description: ChannelInitializer抽象类
 * @author: mqxu
 * @date: 2021/10/30
 */
public abstract class ChannelInitializer implements CompletionHandler<AsynchronousSocketChannel, AioServer> {

    @Override
    public void completed(AsynchronousSocketChannel channel, AioServer attachment) {
        try {
            initChannel(channel);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 再此接收客户端连接
            attachment.serverSocketChannel().accept(attachment, this);
        }
    }

    @Override
    public void failed(Throwable exc, AioServer attachment) {
        exc.getStackTrace();
    }

    /**
     * 初始化
     * @param channel channel
     * @throws Exception 异常
     */
    protected abstract void initChannel(AsynchronousSocketChannel channel) throws Exception;

}