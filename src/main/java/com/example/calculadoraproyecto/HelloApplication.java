package com.example.calculadoraproyecto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PantallaHUB.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 272, 400);
        stage.setTitle("");
        stage.setScene(scene);
        stage.show();





    }





    public static void main(String[] args) {
        launch();
    }
}