package com.radical.chatui;

import com.radical.chatui.view.chat.ChatController;
import com.radical.chatui.view.chat.IChatEvent;
import com.radical.chatui.view.chat.IChatMethod;
import com.radical.chatui.view.login.ILoginEvent;
import com.radical.chatui.view.login.ILoginMethod;
import com.radical.chatui.view.login.LoginController;
import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Date;

/**
 * 启动主类--登录窗口
 * @author radical
 */

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        ILoginMethod login = new LoginController((userId, userPassword) -> {
            if ("radical".equals(userId) && "123".equals(userPassword)) {
                //登录成功，弹出窗口
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.titleProperty().set("微聊");
                alert.headerTextProperty().set("欢迎使用微聊，祝您生活愉快");
                alert.showAndWait();
                IChatMethod chat = new ChatController(new IChatEvent() {
                });
                chat.doShow();
                chat.setUserInfo("1000001", "Radical", "https://urlify.cn/FjIjmm");

                // 好友 - 对话框
                chat.addTalkBox(0, 1, "1000001", "许老师", "https://urlify.cn/ZNJJJr", "", new Date(), true);
                chat.addTalkMsgUserLeft("1000001", "别人的1024程序员节VS你的1024程序员节", new Date(), true, false, true);
                chat.addTalkMsgRight("1000001", "许老师好", new Date(), true, true, false);

                chat.addTalkBox(-1, 0, "1000011", "金帅", "https://urlify.cn/jMZZri", "", new Date(), false);
                chat.addTalkMsgRight("1000011", "且将新火试新茶 诗酒趁年华", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000011", "说个鬼呀，明天早上帮我带份饭", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000002", "吴文杰", "https://urlify.cn/muQRji", "", new Date(), false);
                chat.addTalkMsgRight("1000002", "如困兽之斗", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000002", "青春逢盛世", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000002", "奋斗正当时", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000003", "许隆", "https://urlify.cn/EnEFFz", "", new Date(), false);
                chat.addTalkMsgRight("1000003", "论在人间凑数的日子", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000003", "南工院生存指南：", new Date(), true, false, true);
                chat.addTalkMsgUserLeft("1000003", "如何在一群卷王之中生活下去", new Date(), true, true, true);

                chat.addTalkBox(-1, 0, "1000004", "陈冬兴", "https://urlify.cn/Q3qEVb", "", new Date(), false);
                chat.addTalkMsgRight("1000004", "明天啥时候起，记得喊我声", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000004", "好的好的", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000004", "没问题！！", new Date(), true, false, true);

                chat.addTalkBox(-1, 0, "1000005", "郝鑫", "https://urlify.cn/VreIRv", "", new Date(), false);
                chat.addTalkMsgRight("1000005", "明天晚上去跑步呀", new Date(), true, false, false);
                chat.addTalkMsgUserLeft("1000005", "OK OK", new Date(), true, true, false);
                chat.addTalkMsgUserLeft("1000005", "明天晚上一起去", new Date(), true, false, true);

                // 群组
                chat.addFriendGroup("2000001", "2126班级群", "https://static01.imgkr.com/temp/b896da6a9a2d4c089267ce80a76c69fe.jpeg");
                chat.addFriendGroup("2000002", "305人类好质量男性", "https://static01.imgkr.com/temp/65ddf0ccb383406daf78f0cfafbf8de4.jpeg");


                // 群组 - 对话框
                chat.addTalkBox(0, 1, "5307397", "人类高质量男性（6）", "https://static01.imgkr.com/temp/65ddf0ccb383406daf78f0cfafbf8de4.jpeg", "", new Date(), true);
                chat.addTalkMsgRight("5307397", "明天满课，别卷了，求求了", new Date(), true, true, false);
                chat.addTalkMsgRight("5307397", "睡觉吧，狗命要紧！！！", new Date(), true, true, false);
                chat.addTalkMsgGroupLeft("5307397", "1000003", "许隆", "https://urlify.cn/EnEFFz", "睡什么睡！", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000004", "陈冬兴", "https://urlify.cn/Q3qEVb", "这就是当代大学生嘛", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000002", "吴文杰", "https://urlify.cn/muQRji", "你怎么睡得着的", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000011", "金帅", "https://urlify.cn/jMZZri", "你这个年龄阶段，怎么睡得着的", new Date(), true, false, true);
                chat.addTalkMsgGroupLeft("5307397", "1000005", "郝鑫", "https://urlify.cn/VreIRv", "你睡得什么的觉！", new Date(), true, false, true);
                chat.addTalkMsgRight("5307397", "好吧好吧，吴文杰明天帮我带早饭哈", new Date(), true, true, false);

                // 好友
                chat.addFriendUser(false, "1000001", "许老师", "https://urlify.cn/ZNJJJr");
                chat.addFriendUser(false, "1000011", "金帅", "https://urlify.cn/jMZZri");
                chat.addFriendUser(false, "1000003", "许隆", "https://static01.imgkr.com/temp/65c999b2caab4edfb92010f9cc8a3ca3.jpeg");
                chat.addFriendUser(false, "1000014", "陈冬兴", "https://static01.imgkr.com/temp/c7cefc7da5594f9f94e1fd77db2083d2.jpeg");
                chat.addFriendUser(false, "1000002", "吴文杰", "https://urlify.cn/muQRji");
                chat.addFriendUser(false, "1000005", "郝鑫", "https://urlify.cn/VreIRv");
            }
            else {
                ILoginMethod loginMethod = new LoginController(new ILoginEvent() {
                    @Override
                    public void doLoginCheck(String userId, String userPassword) {
                    }
                });
                loginMethod.doLoginError();
            }
        });
        login.doShow();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
