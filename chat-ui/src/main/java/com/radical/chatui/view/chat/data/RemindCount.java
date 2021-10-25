package com.radical.chatui.view.chat.data;

/**
 * 消息提醒
 *
 * @author radical
 */
public class RemindCount {

    /**
     * 消息提醒条数
     */
    private int count = 0;

    public RemindCount() {
    }

    public RemindCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
