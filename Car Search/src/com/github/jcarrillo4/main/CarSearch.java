package com.github.jcarrillo4.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class CarSearch extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Car Search");

        VBox vb = new VBox();
        vb.setPadding(new Insets(100, 10, 10, 10));
        vb.setSpacing(20);
        vb.setAlignment(Pos.TOP_CENTER);

        TextArea listView = new TextArea();
        listView.setMinSize(400, 200);
        listView.setMaxSize(400, 200);
        listView.setEditable(false);
        vb.getChildren().add(listView);

        TextField searchBar = new TextField();
        searchBar.setMaxSize(400, 75);
        vb.getChildren().add(searchBar);

        Button searchBtn = new Button("Send");
        searchBtn.setMaxSize(100, 50);
        vb.getChildren().add(searchBtn);


        primaryStage.setScene(new Scene(vb, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
