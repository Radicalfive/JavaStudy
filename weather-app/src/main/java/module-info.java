module com.radical.weatherapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;

    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.materialdesign;

    opens com.radical.weatherapp to javafx.fxml;
    exports com.radical.weatherapp;

    opens com.radical.weatherapp.view to javafx.fxml;
    exports com.radical.weatherapp.view;

    opens com.radical.weatherapp.util;
}