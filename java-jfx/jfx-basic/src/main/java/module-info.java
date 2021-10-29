module com.radical.jfxbasic {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.radical.jfxbasic to javafx.fxml;
    exports com.radical.jfxbasic;

    exports com.radical.jfxbasic.chart;
    opens com.radical.jfxbasic.chart to javafx.fxml;

    exports com.radical.jfxbasic.trayicon;
    opens com.radical.jfxbasic.trayicon to javafx.fxml;

    exports com.radical.jfxbasic.animate;
    opens com.radical.jfxbasic.animate to javafx.fxml;

    exports com.radical.jfxbasic.control;
    opens com.radical.jfxbasic.control to javafx.fxml;

    requires com.github.oshi;
    requires fastjson;
    requires java.desktop;
}