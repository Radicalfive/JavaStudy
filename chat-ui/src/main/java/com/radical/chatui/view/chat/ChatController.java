package com.radical.chatui.view.chat;

/**
 * 窗体的控制管理类
 * @author mqxu
 */
public class ChatController extends ChatInit implements IChatMethod{

    private ChatEventDefine chatEventDefine;

    @Override
    public void initView() {

    }

    @Override
    public void initEventDefine() {
        chatEventDefine = new ChatEventDefine();
    }

    @Override
    public void doShow() {
        super.show();
    }

}
