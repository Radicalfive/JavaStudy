module com.radical.jfxbasic {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.radical.jfxbasic to javafx.fxml;
    exports com.radical.jfxbasic;

    exports com.radical.jfxbasic.chart;
    opens com.radical.jfxbasic.chart to javafx.fxml;

    requires com.github.oshi;
    requires fastjson;
}