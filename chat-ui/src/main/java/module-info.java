module com.radical.chatui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.radical.chatui to javafx.fxml;
    exports com.radical.chatui;
}