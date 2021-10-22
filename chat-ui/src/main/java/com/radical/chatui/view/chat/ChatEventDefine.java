package com.radical.chatui.view.chat;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class ChatEventDefine {
    /**
     *
     * @param barChat
     * @param groupBarChat
     * @param toggle
     */

    private final ChatInit chatInit;
    private final IChatEvent chatEvent;
    private final IChatMethod chatMethod;

    public ChatEventDefine(ChatInit chatInit, IChatEvent chatEvent, IChatMethod chatMethod ) {
        this.chatInit = chatInit;
        this.chatEvent = chatEvent;
        this.chatMethod = chatMethod;
        barChat();
        barFriend();
    }


    private void switchBarChat(Button barChat, Pane groupBarChat, boolean toggle) {
        if (toggle) {
            barChat.setStyle("-fx-background-image: url('./img/system/chat_2.png')");
            groupBarChat.setVisible(true);
        } else {
            barChat.setStyle("-fx-background-image: url('./img/system/chat_0.png')");
            groupBarChat.setVisible(false);
        }
        /**
         * 切换聊天窗体方法
         */
        groupBarChat.setVisible(toggle);
    }


    private void switchBarFriend(Button barFriend, Pane groupBarFriend, boolean toggle) {
        if (toggle) {
            barFriend.setStyle("-fx-background-image: url('./img/system/friend_2.png')");
            groupBarFriend.setVisible(true);
        } else {
            barFriend.setStyle("-fx-background-image: url('./img/system/friend_0.png')");
            groupBarFriend.setVisible(false);
        }
        /**
         * 切换好友窗体方法
         */
        groupBarFriend.setVisible(toggle);
    }

    private void barChat() {
        Button barChat = chatInit.$("barChat", Button.class);
        Pane groupBarChat = chatInit.$("groupBarChat", Pane.class);
        barChat.setOnAction(event -> {
            switchBarChat(barChat, groupBarChat, true);
            switchBarFriend(chatInit.$("barFriend", Button.class), chatInit.$("groupBarFriend", Pane.class), false);});
        barChat.setOnMouseEntered(event -> {boolean visible = groupBarChat.isVisible();
            if (visible) {
                return;
            }
            barChat.setStyle("-fx-background-image: url('./img/system/chat_1.png')");});
        barChat.setOnMouseExited(event -> {
            boolean visible = groupBarChat.isVisible();
            if (visible) {
                return;
            }
            barChat.setStyle("-fx-background-image: url('./img/system/chat_0.png')");});

    }
    private void barFriend() {
        Button barFriend = chatInit.$("barFriend", Button.class);
        Pane groupBarFriend = chatInit.$("groupBarFriend", Pane.class);
        barFriend.setOnAction(event -> {
            switchBarChat(chatInit.$("barChat", Button.class), chatInit.$("groupBarChat", Pane.class), false);
            switchBarFriend(barFriend, groupBarFriend, true);
        });
        barFriend.setOnMouseEntered(event -> {
            boolean visible = groupBarFriend.isVisible();
            if (visible) {
                return;
            }
            barFriend.setStyle("-fx-background-image: url('./img/system/friend_1.png')");});
            barFriend.setOnMouseExited(event -> {
            boolean visible = groupBarFriend.isVisible();
            if (visible) {
                return;
            }
            barFriend.setStyle("-fx-background-image: url('./img/system/friend_0.png')");});
    }


}
