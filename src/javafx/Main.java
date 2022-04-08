package javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Main extends Application {

    public final static String connectionString = "jdbc:mysql://localhost:3306/t2108m";
    public final static String user = "root";
    public final static String password = "";

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


        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString, user, password);
            Statement stt = conn.createStatement();

            String txt_sql = "select * from person";
            ResultSet rs = stt.executeQuery(txt_sql);
            while(rs.next()){
                personList.add(new Person(rs.getString("fullName"), rs.getString("email"), rs.getInt("age")));

            }

        }catch (Exception e){
            System.out.println("Error..");
        }
        launch(args);
    }
}