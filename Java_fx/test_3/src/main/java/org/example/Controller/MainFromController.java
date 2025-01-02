package org.example.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class MainFromController {

    public TextField txtExample;
    public Label lblId;
    public TextField txtName;
    public TextField txtAge;
    public TextField txtaddress;
    public TextField txtcontacat;
    public Label lblName;
    public Label lblAge;
    public Label lbladdress;
    public Label lblContact;
    public CheckBox chechk;
    public RadioButton raMale;
    public RadioButton raFemale;


    public  MainFromController(){
        System.out.println("Constructor");
    }

    public void btnClickMeOnAction(ActionEvent actionEvent) {
        String text = txtExample.getText();
        lblId.setText(text);
        txtExample.clear();

    }


    public void btnSubmitOnAction(ActionEvent actionEvent) {

        lblName.setText(txtName.getText());
        lblAge.setText(txtAge.getText());
        lbladdress.setText(txtaddress.getText());
        lblContact.setText(txtcontacat.getText());

        boolean selected = chechk.isSelected();

        if(selected){
            raMale.setSelected(true);
        }else {
            raFemale.setSelected(true);
        }

        txtName.clear();
        txtAge.clear();
        txtaddress.clear();
        txtcontacat.clear();

    }
}
