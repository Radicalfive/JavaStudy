package com.radical.netty.demo.bio.client;

import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @description: bio客户端
 * @author: radical
 * @date: 2021/10/30
 */
public class BioClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.137.1", 7397);
            System.out.println("BIO客户端启动成功！");
            BioClientHandler bioClientHandler = new BioClientHandler(socket, StandardCharsets.UTF_8);
            bioClientHandler.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
