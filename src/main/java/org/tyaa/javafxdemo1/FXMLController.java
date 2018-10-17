package org.tyaa.javafxdemo1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button button;
    
    public FXMLController(){}
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        button.setText("New text");
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        label.setText("Hello World!");
    }    
}
