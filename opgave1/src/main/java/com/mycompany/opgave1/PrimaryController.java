package com.mycompany.opgave1;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class PrimaryController {

    @FXML
    private Label beskedID;
    @FXML
    private TextField txtFAction;
    @FXML
    private RadioButton atbtn;
    @FXML
    private RadioButton cbtn;
    @FXML
    private Spinner<?> cSpin;
    @FXML
    private Button krypterBtn;
    @FXML
    private TextField kryptxt;
    @FXML
    private TextField dkryptxt;
    @FXML
    private Button dbtn;

    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void txtFaction(ActionEvent event) {
    }

    @FXML
    private void atbtnAction(ActionEvent event) {
    }

    @FXML
    private void cbtnAction(ActionEvent event) {
    }

    @FXML
    private void spinnerAction(MouseEvent event) {
    }

    @FXML
    private void krypterBtnAction(ActionEvent event) {
    }

    @FXML
    private void kryptxtAction(ActionEvent event) {
    }

    @FXML
    private void dkryptxtAction(ActionEvent event) {
    }

    @FXML
    private void dbtnAction(ActionEvent event) {
    }
}
