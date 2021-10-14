module com.radical.music {
    requires javafx.controls;
    requires javafx.fxml;
    requires AnimateFX;


    opens com.radical.java.music.ctrl to javafx.fxml;
    opens com.radical.java.music to javafx.fxml;
    exports com.radical.java.music;

    opens com.radical.java.music.layout to javafx.fxml;
    exports com.radical.java.music.layout;

    opens com.radical.java.music.basic to javafx.fxml;
    exports com.radical.java.music.basic;

    opens com.radical.java.music.effect to javafx.fxml;
    exports com.radical.java.music.effect;
}