package com.radical.java.music;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import com.radical.java.music.config.AppConfig;
import com.radical.java.music.ctrl.MusicCtrl;

import java.io.IOException;
import java.util.Objects;

/**
 * 主类
 *
 * @author radical
 * @date 2021/10/4
 */
public class MusicApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(MusicApp.class.getResource("fxml/music.fxml")));
        Parent root = loader.load();
        root.getStylesheets().add(Objects.requireNonNull(MusicApp.class.getResource("css/music.css")).toExternalForm());

        MusicCtrl controller = loader.getController();
        controller.setStage(stage);

        Scene scene = new Scene(root, AppConfig.stageWidth, AppConfig.stageHeight);
        stage.setScene(scene);
        stage.setResizable(AppConfig.stageResizable);
        stage.getIcons().add(new Image(Objects.requireNonNull(MusicApp.class.getResourceAsStream(AppConfig.icon))));

        stage.initStyle(StageStyle.TRANSPARENT);
        stage.show();
    }

    public static void main(String[] args) {
        AppConfig.init();
        launch();
    }
}
