package org.example.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.tm.BookTM;

import java.util.ArrayList;

public class TableFromController {

    public TableView <BookTM> tblBook;
    public TableColumn <BookTM,String> calBookId;
    public TableColumn <BookTM,Double>calPrice;
    public TableColumn <BookTM,Integer>calBookqty;
    public TableColumn <BookTM,String> colBookName;
    public TableColumn <BookTM,Button>colAction;

    public void initialize(){

        BookTM book1 = new BookTM("B001", "Java Programming", 2500.00, 10);
        book1.setButton(new Button("Delete"));
        BookTM book2 = new BookTM("B002", "Spring Boot Essentials", 3500.00, 5);
        book2.setButton(new Button("Delete"));
        BookTM book3 = new BookTM("B003", "Database Design", 2000.00, 8);
        book3.setButton(new Button("Delete"));
        BookTM book4 = new BookTM("B004", "Software Architecture", 4000.00, 3);
        book4.setButton(new Button("Delete"));
        BookTM book5 = new BookTM("B005", "Clean Code", 3000.00, 7);
        book5.setButton(new Button("Delete"));


        ArrayList<BookTM> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);

        ObservableList<BookTM> bookTMS = FXCollections.observableArrayList(list);
        tblBook.setItems(bookTMS);


        calBookId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colBookName.setCellValueFactory(new PropertyValueFactory<>("price"));
        calPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        calBookqty.setCellValueFactory(new PropertyValueFactory<>("qty"));
        colAction.setCellValueFactory(new PropertyValueFactory<>("button"));


    }
}
