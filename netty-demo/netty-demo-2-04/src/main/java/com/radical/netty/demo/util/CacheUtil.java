package com.radical.netty.demo.util;

import com.radical.netty.demo.domain.FileBurstInstruct;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: CacheUtil
 * @author: radical
 * @date: 2021-11-02
 **/
public class CacheUtil {

    public static Map<String, FileBurstInstruct> burstDataMap = new ConcurrentHashMap<>();

}
