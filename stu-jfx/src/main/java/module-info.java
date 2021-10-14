module com.example.stujfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stujfx to javafx.fxml;
    exports com.example.stujfx.lesson2;
    exports com.example.stujfx.lesson1;
    exports com.example.stujfx.lesson3;
    exports com.example.stujfx.lesson4;
    opens com.example.stujfx.lesson1 to javafx.fxml;
    opens com.example.stujfx.lesson2 to javafx.fxml;
    opens com.example.stujfx.lesson3 to javafx.fxml;
    opens com.example.stujfx.lesson4 to javafx.fxml;
}