package com.company;

import com.company.payment.Cash;
import com.company.payment.Payment;
import com.company.payment.PaymentMethod;
import com.jfoenix.controls.JFXComboBox;
import com.sun.rowset.internal.Row;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.*;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXSpinner;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;



public class wow2 extends Application {
    public void start(Stage primaryStage) {
        VBox vbx_main = new VBox();

        Scene scene = new Scene(vbx_main);
        scene.getStylesheets().add("file:src/com/company/media/styles.css");
       HBox hBox = new HBox();
        ImageView imageView = new ImageView();
        Label label = new Label();
        JFXSpinner jFXSpinner = new JFXSpinner();
        Line line = new Line();
        HBox hBox0 = new HBox();
        GridPane gridPane = new GridPane();
        ColumnConstraints columnConstraints = new ColumnConstraints();
        ColumnConstraints columnConstraints0 = new ColumnConstraints();
        ColumnConstraints columnConstraints1 = new ColumnConstraints();
        RowConstraints rowConstraints = new RowConstraints();
        RowConstraints rowConstraints0 = new RowConstraints();
        RowConstraints rowConstraints1 = new RowConstraints();
        RowConstraints rowConstraints2 = new RowConstraints();
        RowConstraints rowConstraints3 = new RowConstraints();
        RowConstraints rowConstraints4 = new RowConstraints();
        RowConstraints rowConstraints5 = new RowConstraints();
        RowConstraints rowConstraints6 = new RowConstraints();
        Label label0 = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        Label label5 = new Label();
        Label label6 = new Label();
        Label label7 = new Label();
        Label label8 = new Label();
        Label label9 = new Label();
        Label label10 = new Label();
        Label label11 = new Label();
        Label label12 = new Label();
        Label label13 = new Label();
        Label label14 = new Label();
        Label label15 = new Label();
        Label label16 = new Label();
        Label label17 = new Label();
       Line line0 = new Line();
        VBox vBox = new VBox();
        GridPane gridPane0 = new GridPane();
        ColumnConstraints columnConstraints2 = new ColumnConstraints();
        ColumnConstraints columnConstraints3 = new ColumnConstraints();
        ColumnConstraints columnConstraints4 = new ColumnConstraints();
        RowConstraints rowConstraints7 = new RowConstraints();
        RowConstraints rowConstraints8 = new RowConstraints();
       RowConstraints rowConstraints9 = new RowConstraints();
       Label label18 = new Label();
        JFXComboBox jFXComboBox = new JFXComboBox();
       JFXButton jFXButton = new JFXButton("Confirm");
        Label label19 = new Label();

  /*      vbx_main.setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);*/
        vbx_main.setPrefHeight(818.0);
        vbx_main.setPrefWidth(1090.0);

        hBox.setPrefHeight(296.0);
        hBox.setPrefWidth(1056.0);

        imageView.setFitHeight(304.0);
        imageView.setFitWidth(302.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);

        label.setPrefHeight(307.0);
        label.setPrefWidth(550.0);
        label.setText("      Payment  ");
        label.setFont(new Font("Century Gothic", 64.0));

        line.setEndX(989.2929077148438);
        line.setEndY(-2.8284270763397217);
        line.setStartX(2078.5859375);
        line.setStartY(-4.242640495300293);

        hBox0.setPrefHeight(502.0);
        hBox0.setPrefWidth(1090.0);

        gridPane.setPrefHeight(503.0);
        gridPane.setPrefWidth(560.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(422.0);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(210.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(298.0);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(283.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(291.0);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(76.0);

        rowConstraints.setMaxHeight(166.0);
        rowConstraints.setMinHeight(0.0);
        rowConstraints.setPrefHeight(108.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(343.0);
        rowConstraints0.setMinHeight(9.0);
        rowConstraints0.setPrefHeight(51.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(377.0);
        rowConstraints1.setMinHeight(0.0);
        rowConstraints1.setPrefHeight(50.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMaxHeight(407.0);
        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(44.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMaxHeight(407.0);
        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(37.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMaxHeight(407.0);
        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(42.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints5.setMaxHeight(407.0);
        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(41.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints6.setMaxHeight(407.0);
        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(153.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(label0, 1);
        label0.setPrefHeight(21.0);
        label0.setPrefWidth(210.0);
        label0.setText("  Movie Name                 :");
        label0.setFont(new Font(18.0));

        GridPane.setRowIndex(label1, 2);
        label1.setPrefHeight(21.0);
        label1.setPrefWidth(210.0);
        label1.setText("  Number of tickets         :");
        label1.setFont(new Font(18.0));

        GridPane.setRowIndex(label2, 3);
        label2.setPrefHeight(21.0);
        label2.setPrefWidth(210.0);
        label2.setText("  Viewing Option             :");
        label2.setFont(new Font(18.0));

        GridPane.setRowIndex(label3, 4);
        label3.setPrefHeight(21.0);
        label3.setPrefWidth(210.0);
        label3.setText("  Ticket Price                    :");
        label3.setFont(new Font(18.0));

        GridPane.setRowIndex(label4, 5);
        label4.setPrefHeight(21.0);
        label4.setPrefWidth(210.0);
        label4.setText("  Hall                                :");
        label4.setFont(new Font(18.0));

        GridPane.setRowIndex(label5, 6);
        label5.setPrefHeight(21.0);
        label5.setPrefWidth(524.0);
        label5.setText("----------------------------------");

        GridPane.setColumnIndex(label6, 1);
        GridPane.setRowIndex(label6, 6);
        label6.setPrefHeight(21.0);
        label6.setPrefWidth(524.0);
        label6.setText("----------------------------------------------");

        GridPane.setRowIndex(label7, 7);
        label7.setPrefHeight(63.0);
        label7.setPrefWidth(210.0);
        label7.setText("  Total Price           :");
        label7.setFont(new Font(24.0));

        GridPane.setColumnIndex(label8, 1);
        GridPane.setRowIndex(label8, 7);
        label8.setPrefHeight(35.0);
        label8.setPrefWidth(131.0);
        label8.setText("label");

        GridPane.setColumnIndex(label9, 2);
        GridPane.setRowIndex(label9, 6);
        label9.setPrefHeight(21.0);
        label9.setPrefWidth(79.0);
        label9.setText("----------");

        GridPane.setColumnIndex(label10, 1);
        label10.setPrefHeight(35.0);
        label10.setPrefWidth(157.0);
        label10.setText("Receipt");
        label10.setFont(new Font(36.0));

        GridPane.setColumnIndex(label11, 2);
        GridPane.setRowIndex(label11, 7);
        label11.setPrefHeight(21.0);
        label11.setPrefWidth(131.0);
        label11.setText("L E");
        label11.setFont(new Font(24.0));

        GridPane.setColumnIndex(label12, 2);
        GridPane.setRowIndex(label12, 4);
        label12.setPrefHeight(21.0);
        label12.setPrefWidth(116.0);
        label12.setText("L.E");

        GridPane.setColumnIndex(label13, 1);
        GridPane.setRowIndex(label13, 1);
        label13.setPrefHeight(21.0);
        label13.setPrefWidth(235.0);
        label13.setText("Label");

        GridPane.setColumnIndex(label14, 1);
        GridPane.setRowIndex(label14, 2);
        label14.setLayoutX(217.0);
        label14.setLayoutY(130.0);
        label14.setPrefHeight(21.0);
        label14.setPrefWidth(235.0);
        label14.setText("Label");

        GridPane.setColumnIndex(label15, 1);
        GridPane.setRowIndex(label15, 3);
        label15.setLayoutX(217.0);
        label15.setLayoutY(179.0);
        label15.setPrefHeight(21.0);
        label15.setPrefWidth(235.0);
        label15.setText("Label");

        GridPane.setColumnIndex(label16, 1);
        GridPane.setRowIndex(label16, 4);
        label16.setLayoutX(217.0);
        label16.setLayoutY(224.0);
        label16.setPrefHeight(21.0);
        label16.setPrefWidth(235.0);
        label16.setText("Label");

        GridPane.setColumnIndex(label17, 1);
        GridPane.setRowIndex(label17, 5);
        label17.setLayoutX(217.0);
        label17.setLayoutY(263.0);
        label17.setPrefHeight(21.0);
        label17.setPrefWidth(235.0);
        label17.setText("Label");

        line0.setEndX(-103.74264526367188);
        line0.setEndY(492.29290771484375);
        line0.setStartX(-96.44975280761719);
        line0.setStartY(984.5858154296875);

        vBox.setPrefHeight(498.0);
        vBox.setPrefWidth(535.0);

        gridPane0.setPrefHeight(317.0);
        gridPane0.setPrefWidth(531.0);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(260.0);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(165.0);

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(355.0);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(223.0);

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMaxWidth(355.0);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(143.0);

        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(30.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints8.setMaxHeight(101.0);
        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(90.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints9.setMaxHeight(135.0);
        rowConstraints9.setMinHeight(10.0);
        rowConstraints9.setPrefHeight(121.0);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setRowIndex(label18, 1);
        label18.setPrefHeight(27.0);
        label18.setPrefWidth(168.0);
        label18.setText("Payment Method   :");
        label18.setFont(new Font(18.0));

        GridPane.setColumnIndex(jFXComboBox, 1);
        GridPane.setRowIndex(jFXComboBox, 1);
        jFXComboBox.getItems().setAll(PaymentMethod.values());

        GridPane.setColumnIndex(jFXButton, 2);
        GridPane.setRowIndex(jFXButton, 2);
        jFXButton.setFont(new Font(18.0));
        jFXButton.getStyleClass().add("btn");


        label19.setPrefHeight(194.0);
        label19.setPrefWidth(538.0);
        label19.setText("label");

        hBox.getChildren().add(imageView);
        hBox.getChildren().add(label);
        hBox.getChildren().add(jFXSpinner);
        vbx_main.getChildren().add(hBox);
       vbx_main.getChildren().add(line);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowConstraints3);
        gridPane.getRowConstraints().add(rowConstraints4);
        gridPane.getRowConstraints().add(rowConstraints5);
        gridPane.getRowConstraints().add(rowConstraints6);
        gridPane.getChildren().add(label0);
        gridPane.getChildren().add(label1);
        gridPane.getChildren().add(label2);
        gridPane.getChildren().add(label3);
        gridPane.getChildren().add(label4);
        gridPane.getChildren().add(label5);
        gridPane.getChildren().add(label6);
        gridPane.getChildren().add(label7);
        gridPane.getChildren().add(label8);
        gridPane.getChildren().add(label9);
        gridPane.getChildren().add(label10);
        gridPane.getChildren().add(label11);
        gridPane.getChildren().add(label12);
        gridPane.getChildren().add(label13);
        gridPane.getChildren().add(label14);
        gridPane.getChildren().add(label15);
        gridPane.getChildren().add(label16);
        gridPane.getChildren().add(label17);
        hBox0.getChildren().add(gridPane);
        hBox0.getChildren().add(line0);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getColumnConstraints().add(columnConstraints3);
        gridPane0.getColumnConstraints().add(columnConstraints4);
        gridPane0.getRowConstraints().add(rowConstraints7);
        gridPane0.getRowConstraints().add(rowConstraints8);
        gridPane0.getRowConstraints().add(rowConstraints9);
        gridPane0.getChildren().add(label18);
        gridPane0.getChildren().add(jFXComboBox);
        gridPane0.getChildren().add(jFXButton);
        vBox.getChildren().add(gridPane0);
        vBox.getChildren().add(label19);
        hBox0.getChildren().add(vBox);
       vbx_main.getChildren().add(hBox0);
        primaryStage.setFullScreen(true);
        primaryStage.setTitle("Cinema Booking Robot");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
