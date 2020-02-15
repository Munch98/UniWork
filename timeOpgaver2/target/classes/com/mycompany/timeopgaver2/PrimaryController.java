/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.timeopgaver2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author xps
 */
public class PrimaryController implements Initializable {

    FileChooser filechooser;
    Scanner scanner;
    File aabnetfil;

    @FXML
    private TextField soegTxt;
    @FXML
    private TextField erstatTxt;
    @FXML
    private TextArea txtArea;
    @FXML
    private Button erstatBtn;
    @FXML
    private Button aabenfilBtn1;
    @FXML
    private Button gemsomBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        filechooser = new FileChooser();
        filechooser.setInitialDirectory(new File("."));
        String line;

    }

    @FXML
    private void soegTxtAction(ActionEvent event) {
    }

    @FXML
    private void erstatTxtAction(ActionEvent event) {
    }

    @FXML
    private void erstatBtnAction(ActionEvent event) {
        String newtxt = "";
        String text = txtArea.getText();
        String[] textSplit = text.split(" ");
        for (int i = 0; i < textSplit.length; i++) {
            if (textSplit[i].equalsIgnoreCase(soegTxt.getText())) {
                textSplit[i] = erstatTxt.getText();
            }
        }

        for (int i = 0; i < textSplit.length; i++) {
            newtxt += textSplit[i] + " ";

        }
        txtArea.setText(newtxt);

    }

    @FXML
    private void gemsomBtnAction(ActionEvent event) {
    }

    @FXML
    private void aabenfilBtnAction1(ActionEvent event) {
        aabnetfil = filechooser.showOpenDialog(null);

        Scanner scanner;
        try {
            scanner = new Scanner(aabnetfil);
            String line1 = "";
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine() + "\n";
                line1 += line;

            }
            txtArea.setText(line1);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

    }

}
