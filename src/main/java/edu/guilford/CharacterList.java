package edu.guilford;

import java.util.ArrayList;

import javafx.scene.text.Text;

public class CharacterList extends ArrayList<Text> {

    public CharacterList() {
        super();
    }

    // Populates the list with character names
    public void populateCharacters() {
        String[] characters = {
            "Invincible", "Omni-Man", "Atom Eve", "Robot", "Rex Splode", 
            "Monster Girl", "Duplicate", "Black Samson", "Allen the Alien", "Cecil Stedman"
        };

        for (String name : characters) {
            this.add(new Text(name));
        }
    }
}
