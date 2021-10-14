package com.wx.java.jfx.ctrl;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;

public class TestCtrl {
    public Button btn;
    public DatePicker dataPicker;

    public void onBtnClick(ActionEvent actionEvent) {
        dataPicker.setDisable(!dataPicker.isVisible());
    }
}
