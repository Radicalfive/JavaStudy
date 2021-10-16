module com.radical.linechar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.radical.linechar to javafx.fxml;
    exports com.radical.linechar;
}