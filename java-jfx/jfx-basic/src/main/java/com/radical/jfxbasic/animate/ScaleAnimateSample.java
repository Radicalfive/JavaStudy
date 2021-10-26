package com.radical.jfxbasic.animate;

import javafx.animation.FillTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * @description: JavaFX缩放动画
 * @author: radical
 * @date: 2021/10/17
 */
public class ScaleAnimateSample extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300);
        stage.setTitle("JavaFX缩放动画");
        stage.setScene(scene);

        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0);
        ds.setColor(Color.color(0.6, 0.6, 0.8));

        Rectangle rect = new Rectangle(100, 100, 100, 100);
        rect.setArcHeight(50);
        rect.setArcWidth(50);
        rect.setFill(Color.VIOLET);

        FillTransition ft = new FillTransition(Duration.millis(3000), rect, Color.PINK, Color.GREY);
        ft.setAutoReverse(true);
        ft.play();

        ScaleTransition st = new ScaleTransition(Duration.millis(2000), rect);
        st.setByX(1.5f);
        st.setByY(1.5f);
        st.setAutoReverse(true);

        st.play();
        root.getChildren().add(rect);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

