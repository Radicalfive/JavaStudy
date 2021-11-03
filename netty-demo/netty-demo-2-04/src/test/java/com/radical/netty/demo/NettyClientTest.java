package com.radical.netty.demo;

import com.radical.netty.demo.client.NettyClient;
import com.radical.netty.demo.domain.FileTransferProtocol;
import io.netty.channel.ChannelFuture;
import com.radical.netty.demo.util.MsgUtil;

import java.io.File;

/**
 * @description: NettyClientTest
 * @author: radical
 * @date: 2021-11-02
 **/
public class NettyClientTest {

    public static void main(String[] args) {
        //启动客户端
        ChannelFuture channelFuture = new NettyClient().connect("127.0.0.1", 7397);

        //文件信息{文件大于1024kb方便测试断点续传}
        File file = new File("/Users/test/Desktop/protoc-3.19.1-win64.zip");
        FileTransferProtocol fileTransferProtocol = MsgUtil.buildRequestTransferFile(file.getAbsolutePath(), file.getName(), file.length());
        //发送信息；请求传输文件
        channelFuture.channel().writeAndFlush(fileTransferProtocol);
    }

}
