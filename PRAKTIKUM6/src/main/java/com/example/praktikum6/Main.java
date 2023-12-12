package com.example.praktikum6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TableView tableView = new TableView();

        TableColumn<Mahasiswa, String> column1 =
                new TableColumn<>("NIM");

        column1.setCellValueFactory(
                new PropertyValueFactory<>("nim"));


        TableColumn<Mahasiswa, String> column2 =
                new TableColumn<>("Nama");

        column2.setCellValueFactory(
                new PropertyValueFactory<>("name"));


        tableView.getColumns().add(column1);
        tableView.getColumns().add(column2);

        tableView.getItems().add(
                new Mahasiswa(1, "Siti", "2201"));
        tableView.getItems().add(
                new Mahasiswa(2, "Ainur", "2202"));
        tableView.getItems().add(
                new Mahasiswa(3, "Rahmawati", "2203"));
        tableView.getItems().add(
                new Mahasiswa(4, "Jamal", "2204"));
        tableView.getItems().add(
                new Mahasiswa(5, "Ryan", "9999"));
        tableView.getItems().add(
                new Mahasiswa(6, "Udin", "2206"));
        tableView.getItems().add(
                new Mahasiswa(7, "Ayam", "2207"));
        tableView.getItems().add(
                new Mahasiswa(8, "Lenery", "2208"));
        tableView.getItems().add(
                new Mahasiswa(9, "Jumbi", "2209"));
        tableView.getItems().add(
                new Mahasiswa(10, "Jane", "2210"));

        VBox vbox = new VBox(tableView);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

}