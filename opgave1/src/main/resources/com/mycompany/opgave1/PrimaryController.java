/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.opgave1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author xps
 */
public class PrimaryController implements Initializable {

    @FXML
    private Label beskedID;
    @FXML
    private TextField txtFAction;
    @FXML
    private RadioButton atbtn;
    @FXML
    private RadioButton cbtn;
    @FXML
    private Spinner<?> cSpinAction;
    @FXML
    private Button krypterBtnAction;
    @FXML
    private TextField kryptxtAction;
    @FXML
    private TextField dkryptxtAction;
    @FXML
    private Button dbtnAction;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
