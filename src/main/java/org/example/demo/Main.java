package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.demo.controller.LoginController;
import org.example.demo.ui.LoginApp;

import java.io.IOException;
import java.net.Socket;

public class Main extends Application {

    public static LoginController loginController;
    public static Scene scene;
    public static Stage stage;

    @Override
     public void start(Stage stage) throws IOException {
        this.stage = stage;
        //Client.client = new Socket("localhost", 8888);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("openFlash.fxml"));
        Parent root = loader.load();
        scene = new Scene(root, 640, 480);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
}