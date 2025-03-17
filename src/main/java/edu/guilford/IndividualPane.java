package edu.guilford;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class IndividualPane extends GridPane {
    private Button submitButton;
    private CharacterPane characterPane;

    public IndividualPane() {
        characterPane = new CharacterPane();  // Set size of the character pane
        this.add(characterPane, 0, 0);
        
        submitButton = new Button("Generate Character Name");
        this.add(submitButton, 0, 1);
        
        submitButton.setFont(Font.font("Times New Roman", 20));

        // Set the event handler for the button
        submitButton.setOnAction(e -> handle(e));
    }

    private void handle(ActionEvent e) {
        // Trigger character name generation when the button is pressed
        characterPane.updateNames();
    }
}
