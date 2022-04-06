package javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static ObservableList<Person> personList = FXCollections.observableArrayList();

    public static Stage rootStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        primaryStage.setTitle("T2108M");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        personList.add(new Person("Nguyễn Nhật Anh","nhatanhn36@gmail.com",18));
        personList.add(new Person("Đỗ Hoàng Anh","hoanganh@gmail.com",18));
        personList.add(new Person("Nguyễn Hoài Nam","namHoai04@gmail.com",18));
        personList.add(new Person("Phạm Phương Linh","phuongLinh06@gmail.com",18));
        launch(args);
    }
}