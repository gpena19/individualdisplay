package edu.guilford;

import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;

public class CharacterPane extends Pane {
    private CharacterList characterList;

    public CharacterPane(int width, int height) {
        super();
        this.characterList = new CharacterList(); // Initialize the CharacterList instance
        this.setPrefSize(width, height);
        this.setStyle("-fx-background-color: lightgray;");

        // Generate names to populate the characterList
        characterList.generateNames(10); // Assuming you want to generate 10 names

// Loop through characterList and display each character name
for (int i = 0; i < characterList.size(); i++) {
    String characterName = characterList.get(i); // Retrieve the character name from the list
    Text nameText = new Text(characterName);
    nameText.setFont(Font.font("Arial", 24));
    nameText.setFill(Color.BLACK);
    nameText.setX(10); // Position of text
    nameText.setY(30 + i * 30); // Position of text (adjusting vertical spacing)
    this.getChildren().add(nameText); // Add the Text object to the Pane
}
    }
}