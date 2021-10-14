
module com.wx.javajfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.wx.java.jfx.ctrl to javafx.fxml;
    exports com.wx.java.jfx;
}