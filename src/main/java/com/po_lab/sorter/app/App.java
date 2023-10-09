package com.po_lab.sorter.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.po_lab.sorter.app.controller.Controller;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(App.class.getResource("view/appView.fxml"));
        Scene scene = new Scene(loader.load(), 1260, 1000);
        Controller mainController = loader.getController();

        stage.setTitle("Sorting Visualization");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}