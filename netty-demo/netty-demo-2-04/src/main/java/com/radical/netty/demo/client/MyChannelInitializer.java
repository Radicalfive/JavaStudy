package com.radical.netty.demo.client;

import com.radical.netty.demo.codec.ObjDecoder;
import com.radical.netty.demo.codec.ObjEncoder;
import com.radical.netty.demo.domain.FileTransferProtocol;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;

/**
 * @description: MyChannelInitializer
 * @author: radical
 * @date: 2021-11-02
 **/
public class MyChannelInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        //对象传输处理
        channel.pipeline().addLast(new ObjDecoder(FileTransferProtocol.class));
        channel.pipeline().addLast(new ObjEncoder(FileTransferProtocol.class));
        // 在管道中添加我们自己的接收数据实现方法
        channel.pipeline().addLast(new MyClientHandler());
    }

}

