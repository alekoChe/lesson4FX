package com.example.lesson4fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(ActionEvent actionEvent) { // ActionEvent actionEvent

        final Button source = (Button) actionEvent.getSource();
        welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println("нажата кнопка " + source.getText());
    }
}