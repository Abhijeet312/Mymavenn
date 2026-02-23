package com.curiem;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {

        Button btn = new Button("JavaFX is Working!");

        Scene scene = new Scene(btn, 400, 250);

        stage.setTitle("JavaFX Maven Setup");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}