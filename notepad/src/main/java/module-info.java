module com.radical.notepad {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.radical.notepad to javafx.fxml;
    exports com.radical.notepad;
}