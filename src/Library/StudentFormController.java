package Library;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.*;

public class StudentFormController {
    public TextField sName;
    public TextField sEmail;
    public TextField sPhoneNumber;
    public TextField sBirthday;
    public TextArea sAddress;

    public final static String connectionString = "jdbc:mysql://localhost:3306/fptlibrary";
    public final static String user = "root";
    public final static String password = "";

    public void cancel() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("StudentsPage.fxml"));
        Main.rootStage.setScene(new Scene(root, 1000, 700));
    }

    public void submit(ActionEvent event) {
        String name = this.sName.getText();
        String email = this.sEmail.getText();
        String phonenumber = this.sPhoneNumber.getText();
        String birthday = this.sBirthday.getText();
        String address = this.sAddress.getText();

        String sql_txt = "insert into students (StudentName, DateOfBirth, Address, Email, PhoneNumber)" +
                " values('"+name+"','"+birthday+"','"+address+"','"+email+"','"+phonenumber+"')";
        System.out.println(sql_txt);
        try {
            //gọi driver
            Class.forName("com.mysql.jdbc.Driver");
            //tạo connect
            Connection conn = DriverManager.getConnection(connectionString, user, password);
            //khai báo statement để truy vấn sql
            Statement stt = conn.createStatement();
            //insert
            stt.execute(sql_txt);
            this.cancel();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

