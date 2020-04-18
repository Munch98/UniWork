package Lesson06FlashingText.src.main.java.flashingtext;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class primaryController implements Initializable {

@FXML
private RadioButton rb200;
@FXML
private RadioButton rb100;
@FXML
private Button stopBtn;
@FXML
private Button startBtn;
@FXML
private Label funLabel;
@FXML
private RadioButton rb400;

@Override
public void initialize(URL url, ResourceBundle rb) {
// initialize
}

    @FXML
    private void rb100Action(ActionEvent ae){
// TODO: handle RadioButton event
    }

    @FXML
    private void rb200Action(ActionEvent ae){
// TODO: handle RadioButton event
    }

    @FXML
    private void rb400Action(ActionEvent ae){
// TODO: handle RadioButton event
    }


    @FXML
private void stopBtnAction(ActionEvent ae){
// TODO: handle Button event
}


@FXML
private void startBtnAction(ActionEvent ae){
    Primary task = new Primary();
    Thread thread = new Thread((Runnable) task);
    thread.start();
}
}
