package com.wx.java.basic.enumeration;


import lombok.extern.slf4j.Slf4j;

enum Signal {
    /**
     * 红色
     */
    RED,
    /**
     * 黄色
     */
    YELLOW,
    /**
     * 绿色
     */
    GREEN
}
@Slf4j
public class StateMachine {

    public static String getTrafficInstruct(Signal signal) {
        String instruct = "信号灯故障";
        switch (signal) {
            case RED:
                instruct = "红灯停";
                break;
            case YELLOW:
                instruct = "黄灯请注意";
                break;
            case GREEN:
                instruct = "绿灯行";
                break;
            default:
                break;
        }
        return instruct;
    }
    public static void main(String[] args) {
        log.info(getTrafficInstruct(Signal.RED));
        log.info(getTrafficInstruct(Signal.YELLOW));
        log.info(getTrafficInstruct(Signal.GREEN));
    }

}
