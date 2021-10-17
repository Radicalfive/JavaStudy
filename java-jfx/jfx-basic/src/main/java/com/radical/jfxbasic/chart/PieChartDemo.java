package com.radical.jfxbasic.chart;

import com.alibaba.fastjson.JSONObject;
import com.radical.jfxbasic.util.SystemInfoUtil;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * @description :饼图
 * @author radical
 * @date :2021/10/17
 */
public class PieChartDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        javafx.scene.chart.PieChart pieChart = new javafx.scene.chart.PieChart();
        pieChart.setData(getChartData());
        pieChart.setTitle("饼图");
        pieChart.setLegendSide(Side.LEFT);
        pieChart.setClockwise(false);
        pieChart.setLabelsVisible(false);

        StackPane root = new StackPane();
        root.getChildren().add(pieChart);
        primaryStage.setScene(new Scene(root , 800 , 500 ));
        primaryStage.show();
    }
    //private ObservableList<javafx.scene.chart.PieChart.Data> getChartData(){
    //    ObservableList<javafx.scene.chart.PieChart.Data> answer = FXCollections.observableArrayList();
    //    answer.addAll(new javafx.scene.chart.PieChart.Data("Java" , 17),
    //            new javafx.scene.chart.PieChart.Data("JavaFx" , 31),
    //            new javafx.scene.chart.PieChart.Data("Swing" , 10),
    //            new javafx.scene.chart.PieChart.Data("IO" , 20),
    //            new javafx.scene.chart.PieChart.Data("NIO" , 21)
    //            );
    //    return answer;
    //}
    /**
     * 调用获取cpu信息的方法
     * @return
     */
    private ObservableList<javafx.scene.chart.PieChart.Data> getChartData(){
        JSONObject message = SystemInfoUtil.getInfo();
        String mem = message.getJSONObject("memInfo").get("usageRate").toString();
        Double memInfo = Double.valueOf(mem.substring(0 , mem.length()-1));
        String jvm = message.getJSONObject("jvmInfo").get("usageRate").toString();
        Double jvmInfo = Double.valueOf(jvm.substring(0 , jvm.length()-1));
        String cpu = message.getJSONObject("cpuInfo").get("cSys").toString();
        Double cpuInfo = Double.valueOf(cpu.substring(0 , cpu.length()-1));

        ObservableList<javafx.scene.chart.PieChart.Data> answer = FXCollections.observableArrayList();
        answer.addAll(new javafx.scene.chart.PieChart.Data("memInfo的使用情况" , memInfo),
                new javafx.scene.chart.PieChart.Data("jvmInfo的使用情况" , jvmInfo),
                new javafx.scene.chart.PieChart.Data("cpuInfo的使用情况" , cpuInfo)
        );
        return answer;
    }
    public static void main(String[] args) {
        launch();
    }
}
