package com.radical.chatui.util;


import com.radical.chatui.view.chat.group_bar_chat.ElementTalk;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 缓存工具
 * @author radical
 */
public class CacheUtil {

    /**
     * 对话框组
     */
    public static Map<String, ElementTalk> talkMap = new ConcurrentHashMap<>(16);

}
