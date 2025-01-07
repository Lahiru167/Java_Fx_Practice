package org.example.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.util.StringConverter;
import org.example.DTO.Student;

import java.util.ArrayList;

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
    public ComboBox<Student> cmbName;
    public Label lblData;

    public void initialize() {
        txtName.setText("Lahiru shehan");
        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student(1, "Lahiru Shehan", 101);
        Student student2 = new Student(2, "Kavindu Perera", 102);
        Student student3 = new Student(3, "Nimali Fernando", 103);
        Student student4 = new Student(4, "Samantha Silva", 104);
        Student student5 = new Student(5, "Amali Gunawardena", 105);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);


        ObservableList<Student> strings = FXCollections.observableArrayList(list);
        cmbName.setItems(strings);

        cmbName.setConverter(new StringConverter<Student>() {
            @Override
            public String toString(Student student) {
                if (student == null) return "";
                return student.getId() + " "+ student.getName();
            }

            @Override
            public Student fromString(String string) {
                return null;
            }
        });

    }

    public MainFromController() {
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

        if (selected) {
            raMale.setSelected(true);
        } else {
            raFemale.setSelected(true);
        }

        txtName.clear();
        txtAge.clear();
        txtaddress.clear();
        txtcontacat.clear();

    }

    public void btnShowOnAction(ActionEvent actionEvent) {
       //  string  value = cmbName.getValue();
       int selectIndex = cmbName.getSelectionModel().getSelectedIndex();
       Student selectItem = cmbName.getSelectionModel().getSelectedItem();

       lblData.setText(selectItem.getName());
       cmbName.getSelectionModel().clearSelection();
    }
}
