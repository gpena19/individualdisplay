package edu.guilford;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class IndividualDisplay extends Application {

    @Override
    public void start(Stage stage) {
        CharacterPane CharacterPane = new CharacterPane();
        Scene scene = new Scene(CharacterPane);
        
        stage.setTitle("Invincible Character Display");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}