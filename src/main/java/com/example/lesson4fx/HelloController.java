package com.example.lesson4fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML // если не повесить эту аннотацию над private, то поле не будет видно в других классах
    private TextArea messageArea;
    @FXML
    private TextField messageField;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick(ActionEvent actionEvent) { // ActionEvent actionEvent

        final Button source = (Button) actionEvent.getSource();
        welcomeText.setText("Welcome to JavaFX Application!");
        System.out.println("нажата кнопка " + source.getText());
    }

    public void clickSendButton(ActionEvent actionEvent) {
        final String message = messageField.getText();
        if (message.isEmpty()) {
            return;
        }
        messageArea.appendText(message + "\n");
        messageField.setText("");
        messageField.requestFocus(); // возвращает фокус на поле
    }

    public void deleteText(ActionEvent actionEvent) {
        messageArea.setText("");
    }

    public void exit(ActionEvent actionEvent) {
        System.exit(0);
    }
}