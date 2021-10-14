package com.radical.java.music.effect;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.InputStream;

/**
 * @author test
 * @date 2021/10/7
 */
public class ColorAdjustEffectExample extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        InputStream is;
        Image image = new Image("https://urlify.cn/qu6vI3");
        ImageView imageView = new ImageView(image);
        imageView.setX(100);
        imageView.setY(70);
        imageView.setFitWidth(400);
        imageView.setFitHeight(200);

        imageView.setPreserveRatio(true);
        ColorAdjust colorAdjust = new ColorAdjust();
        // 对比度
        colorAdjust.setContrast(0.2);
        // 色调
        colorAdjust.setHue(0.1);
        // 亮度
        colorAdjust.setBrightness(0.2);
        // 饱和度
        colorAdjust.setSaturation(0.6);
        imageView.setEffect(colorAdjust);

        Node[] node;
        Group root = new Group(imageView);

        Scene scene = new Scene(root , 400 ,300 );
        stage.setTitle("Color Adjust effect example");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
