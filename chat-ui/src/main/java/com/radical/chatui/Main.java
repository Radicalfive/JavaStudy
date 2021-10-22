package com.radical.chatui;


import com.radical.chatui.view.login.ILoginMethod;
import com.radical.chatui.view.login.LoginController;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * 启动主类
 * @author radical
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        ILoginMethod login = new LoginController((userId, userPassword) -> {
            System.out.println("登陆 userId：" + userId + "userPassword：" + userPassword);
        });
        login.doShow();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
//public class Main extends Application {
//
//    @Override
//    public void start(Stage stage) throws IOException {
//        IChatMethod chat = new ChatController();
//        chat.doShow();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
