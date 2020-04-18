/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author erso
 */
public class Primary implements Initializable {
    public Button startBtn;
    public Button stopBtn;
    public RadioButton ms100;
    public RadioButton ms200;
    public RadioButton ms400;
    private long sleeptimer;
    @FXML
    private Label funLabel;
    private String text;
    private Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                while (true) {
                    if (funLabel.getText().trim().length() == 0) {
                        text = "Programming is fun";
                    } else {
                        text = "";
                    }
                    System.out.println("Flash: " + text);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            funLabel.setText(text);
                        }
                    });

                    Thread.sleep(100);
                }
            } catch (InterruptedException ex) {
            }

        }

    });

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        thread.setDaemon(true);
        thread.start();

    }

    public void startBtnAction(ActionEvent actionEvent) {
        thread.start();
    }

    public void stopBtnAction(ActionEvent actionEvent) {
        thread.interrupt();
    }

    public void ms100action(ActionEvent actionEvent) throws InterruptedException {
        Thread.sleep(100);
    }


    public void ms200action(ActionEvent actionEvent) {
    }

    public void ms400action(ActionEvent actionEvent) {
    }

    public void radiohandler(ActionEvent actionEvent) {
        if (ms100.isSelected()) {
            sleeptimer = 100;
        }
        if (ms200.isSelected()) {
            sleeptimer = 200;
        }
        if (ms400.isSelected()) {
            sleeptimer = 400;
        }
    }}