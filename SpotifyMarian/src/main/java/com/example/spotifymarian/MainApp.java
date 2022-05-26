package com.example.spotifymarian;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;
import java.util.Objects;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        /* FXMLLoader fxmlLoader = new FXMLLoader(Controlador.class.getResource("sample.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 270, 380);
        stage.setTitle("Spotify");
        stage.setScene(scene);
        stage.show();*/

            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("sample.fxml")));
            Scene scene = new Scene(root);

            stage.setTitle("Spotify");
            stage.setScene(scene);
            stage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}