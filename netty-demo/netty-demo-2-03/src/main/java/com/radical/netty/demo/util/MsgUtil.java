package com.radical.netty.demo.util;

import com.radical.netty.demo.domain.MsgInfo;

/**
 * @description: MsgUtil
 * @author: radical
 * @date: 2021-11-02
 */
public class MsgUtil {

    public static MsgInfo buildMsg(String channelId, String msgContent) {
        return new MsgInfo(channelId,msgContent);
    }

}
