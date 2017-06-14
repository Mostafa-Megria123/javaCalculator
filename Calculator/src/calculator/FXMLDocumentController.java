/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Mostafa
 */
public class FXMLDocumentController implements Initializable {
    Float data = 0f ;
    int operation = -1;
    Float plsmin;

    
    @FXML
    private Label label;
    
    @FXML
    private TextField display;

    @FXML
    private JFXButton plus;

    @FXML
    private JFXButton three;

    @FXML
    private JFXButton two;

    @FXML
    private JFXButton one;

    @FXML
    private JFXButton four;

    @FXML
    private JFXButton five;

    @FXML
    private JFXButton six;

    @FXML
    private JFXButton minus;

    @FXML
    private JFXButton seven;

    @FXML
    private JFXButton eight;

    @FXML
    private JFXButton nine;

    @FXML
    private JFXButton mult;

    @FXML
    private JFXButton zero;

    @FXML
    private JFXButton plusminus;
    
    @FXML
    private JFXButton clear;

    @FXML
    private JFXButton div;

    @FXML
    private JFXButton equals;
    
    @FXML
    private JFXButton dot;
     
    @FXML
    void handleButtonAction(ActionEvent event) {
        if(event.getSource() == one){
            display.setText(display.getText() + "1");
        }else if(event.getSource() == two){
            display.setText(display.getText() + "2");
        }else if(event.getSource() == three){
            display.setText(display.getText() + "3");
        }else if(event.getSource() == four){
            display.setText(display.getText() + "4");
        }else if(event.getSource() == five){
            display.setText(display.getText() + "5");
        }else if(event.getSource() == six){
            display.setText(display.getText() + "6");
        }else if(event.getSource() == seven){
            display.setText(display.getText() + "7");
        }else if(event.getSource() == eight){
            display.setText(display.getText() + "8");
        }else if(event.getSource() == nine){
            display.setText(display.getText() + "9");
        }else if(event.getSource() == zero){
            display.setText(display.getText() + "0");
        }else if(event.getSource() == dot){
            display.setText(display.getText() + ".");
        }else if(event.getSource() == clear){
            display.setText("");
        }else if(event.getSource() == plusminus){
            plsmin = (Float.parseFloat(String.valueOf(display.getText())));
            plsmin = plsmin*(-1);
            display.setText(String.valueOf(plsmin));
        }else if(event.getSource() == plus){
            data = Float.parseFloat(display.getText());
            operation = 1;  //ADDITION
            display.setText("");
        }else if(event.getSource() == minus){
            data = Float.parseFloat(display.getText());
            operation = 2;  //SUBTRACTION
            display.setText("");
        }else if(event.getSource() == mult){
            data = Float.parseFloat(display.getText());
            operation = 3;  //MULTIPLICATION
            display.setText("");
        }else if(event.getSource() == div){
            data = Float.parseFloat(display.getText());
            operation = 4;  //DIVISION
            display.setText("");
        }else if(event.getSource() == equals){
            Float secondOperand = Float.parseFloat(display.getText());
            switch(operation){
                case 1:
                    Float ans = data + secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
            
                case 2:
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans));
                    break;
    
                case 3:
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));
                    break;

                case 4:
                    ans = 0f;
                    try{
                        ans = data / secondOperand;
                    }catch(Exception e){display.setText("Error");}
                   
                    display.setText(String.valueOf(ans));
                    break;

            }
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
