package com.radical.netty.demo.domain;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;

/**
 * @description: MessageTest
 * @author: radical
 * @date: 2021-11-02
 **/
public class MessageTest {

    public static void main(String[] args) throws IOException {
        String str = "hello,这是一条测试消息";
        Message msg = new Message((byte) 0xAD, 35, str);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            ObjectOutputStream os = new ObjectOutputStream(out);
            os.writeObject(msg);
            os.flush();
            byte[] b = out.toByteArray();
            os.close();
            out.close();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("JDK序列化10000次耗时：" + (endTime - startTime));

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            ByteBuffer buffer = ByteBuffer.allocate(1024);
            byte[] bt = msg.getMsgBody().getBytes();
            buffer.put(msg.getType());
            buffer.putInt(msg.getLength());
            buffer.put(bt);
            buffer.flip();
            byte[] result = new byte[buffer.remaining()];
            buffer.get(result);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用二进制序列化10000次耗时：" + (endTime1 - startTime1));
    }
}
