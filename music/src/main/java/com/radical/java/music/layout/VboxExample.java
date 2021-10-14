package com.radical.java.music.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VboxExample extends Application {
    @Override
    public void start(Stage stage) {
        TextField textField = new TextField();
        Button playButton = new Button("Play");
        Button stopButton = new Button("Stop");

        VBox vbox = new VBox();
        vbox.setSpacing(10);
        HBox.setMargin(textField, new Insets(20,20,20,20));
        HBox.setMargin(playButton, new Insets(20,20,20,20));
        HBox.setMargin(stopButton, new Insets(20,20,20,20));

        vbox.getChildren().addAll(textField,playButton,stopButton);

        Parent root;
        Scene scene=new Scene(vbox, 400,300);
        stage.setTitle("Vbox Example");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
