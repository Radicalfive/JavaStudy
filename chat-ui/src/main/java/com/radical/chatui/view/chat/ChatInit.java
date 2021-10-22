package com.radical.chatui.view.chat;

import com.radical.chatui.Main;
import com.radical.chatui.view.UIObject;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.util.Objects;

/**
 * 窗体的初始化操作
 *
 * @author mqxu
 */
public abstract class ChatInit extends UIObject {

    private static final String RESOURCE_NAME = "view/chat/chat.fxml";

    public Button barChat;
    public Button barPortrait;
    public Button barFriend;
    public Button barLocation;
    public Button barSet;
    public Pane bar;
    public Pane groupBarChat;
    public Pane groupBarFriend;

    ChatInit() {
        try {
            root = FXMLLoader.load(Objects.requireNonNull(Main.class.getResource(RESOURCE_NAME)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scene scene = new Scene(root,980,720);
        scene.setFill(Color.TRANSPARENT);
        setScene(scene);
        initStyle(StageStyle.TRANSPARENT);
        setResizable(false);
        this.getIcons().add(new Image(Objects.requireNonNull(Main.class.getResourceAsStream("view/chat/img/head/logo.png"))));
        initView();
        obtain();
        initEventDefine();
    }
    private void obtain() {
        barChat = $("barChat");
        barPortrait = $("barPortrait");
        barFriend = $("barFriend");
        barLocation = $("barLocation");
        barSet = $("barSet");
        bar = $("bar");
        groupBarChat = $("groupBarChat");
        groupBarFriend = $("groupBarFriend");

    }
}
