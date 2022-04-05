package com.example.vavamalezadanie;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    public Label regex;
    @FXML
    public Label string;
    @FXML
    private Label result;
    @FXML
    private TextField regexInp;
    @FXML
    private TextArea stringInp;

    @FXML
    protected void check() {
        if (stringInp.getText().toString().matches(regexInp.getText().toString())){
            result.setText("String matches");
        }
        else result.setText("String does not match");
    }
}