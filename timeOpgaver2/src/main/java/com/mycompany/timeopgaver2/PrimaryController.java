package com.mycompany.timeopgaver2;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField soegTxt;
    @FXML
    private TextField erstatTxt;
    @FXML
    private TextArea txtArea;
    @FXML
    private Button erstatBtn;
    @FXML
    private Button aabenfilBtn;
    @FXML
    private Button gemsomBtn;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void soegTxtAction(ActionEvent event) {
        soegTxt.getText()
    }

    @FXML
    private void erstatTxtAction(ActionEvent event) {
    }

    @FXML
    private void erstatBtnAction(ActionEvent event) {
    }


    @FXML
    private void gemsomBtnAction(ActionEvent event) {
    }

    @FXML
    private void aabenfilBtnAction1(ActionEvent event) {
    }
}
