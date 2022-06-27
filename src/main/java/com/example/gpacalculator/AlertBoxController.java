package com.example.gpacalculator;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBoxController extends Application {
    static Stage stage = new Stage();
    public static void display() throws Exception {
        new AlertBoxController().start(stage);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AlertBox.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Image icon = new Image("D:\\JavaCodes\\GpaCalculator\\src\\main\\resources\\com\\example\\gpacalculator\\AAST.jpg");
        stage.setTitle("GPA Calculator");
//        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.show();
    }
    @FXML
    public void clickDone(){
        stage.close();
    }
}
