package com.example.iaproject;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private DatePicker datePick;
    @FXML
    private ComboBox timePick;
    @FXML
    private Label welcomeText;

    @FXML
    private void initialize(){
        System.out.println("wassup");
    }

    @FXML
    private void selectDate(){
        System.out.println(datePick.getValue());
    }
    @FXML
    private void selectTime(){

    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}