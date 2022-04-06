package Session9.Lab1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    public static ObservableList<Contact> contactList = FXCollections.observableArrayList();

    public static Stage rootStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("phonebook.fxml"));
        primaryStage.setTitle("T2108M");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }

    public static void main(String[] args){
        contactList.add(new Contact("Nguyễn Nhật Anh", "0964305721"));
        contactList.add(new Contact("Đỗ Hoàng Anh", "0957864213"));
        contactList.add(new Contact("Nguyễn Hoài Nam", "0165324798"));
        contactList.add(new Contact("Phạm Phương Linh", "0986752331"));
        launch(args);
    }
}