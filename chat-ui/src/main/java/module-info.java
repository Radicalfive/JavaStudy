module com.radical.chatui {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.radical.chatui to javafx.fxml;
    exports com.radical.chatui;

    exports com.radical.chatui.view;
    opens com.radical.chatui.view to javafx.fxml;

    opens com.radical.chatui.view.login to javafx.fxml;
    exports com.radical.chatui.view.login;

    //opens com.radical.chatui.view.chat to javafx.fxml;
    //exports com.radical.chatui.view.chat;
}