package com.radical.chatui;

import com.radical.chatui.view.chat.ChatController;
import com.radical.chatui.view.chat.IChatMethod;
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
                alert.titleProperty().set("提示");
                alert.headerTextProperty().set("登录成功！");
                alert.showAndWait();
                IChatMethod chat = new ChatController();
                chat.doShow();
                // 填充对话框测试数据
                chat.addTalkBox(-1, 0, "1000001", "王潇", "https://urlify.cn/FjIjmm", "如困兽之斗", new Date(), true);
                chat.addTalkBox(-1, 0, "1000002", "许老师", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/me.jpg", "开到荼蘼", new Date(), false);
                chat.addTalkBox(-1, 0, "1000003", "杨阳大佬", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/1.jpg", "这世界只有10种人，一种是程序员，一种不是。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000004", "尚宇驰学姐", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/2.jpg", "PuTTY本无树，MinGW亦非台。", new Date(), false);
                chat.addTalkBox(-1, 0, "1000005", "陈蓉琪学姐", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/3.jpg", "Write the code. Change the world.", new Date(), false);
                chat.addTalkBox(-1, 0, "1000006", "王林大佬", "https://urlify.cn/jMZZri", "生产队的驴", new Date(), false);
                chat.addTalkBox(-1, 0, "1000007", "金帅", "https://urlify.cn/muQRji", "305内卷最严重之人", new Date(), true);
                chat.addTalkBox(-1, 0, "1000008", "吴文杰", "https://urlify.cn/EnEFFz", "呼呼哈嘿，，，，", new Date(), false);
                chat.addTalkBox(-1, 0, "1000009", "陈东兴", "https://urlify.cn/Q3qEVb", "哈哈哈哈哈哈", new Date(), false);
                chat.addTalkBox(0, 1, "5307397", "ssy松山院", "https://niit-soft.oss-cn-hangzhou.aliyuncs.com/avatar/5.jpg", "松山院~学习之路", new Date(), false);
                chat.addTalkBox(0, 1, "5307398", "筠竹苑", "https://urlify.cn/VreIRv", "筠竹苑~~305宿舍yyds", new Date(), false);
            }
            else {
                //弹出窗口，提示登录失败
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.titleProperty().set("提示");
                alert.headerTextProperty().set("登录失败！");
            }
        });
        login.doShow();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
