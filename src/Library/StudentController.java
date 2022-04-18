package Library;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class StudentController implements Initializable {

    public TableView<Student> tbStudents;
    public TableColumn<Student, String> sName;
    public TableColumn<Student, String> sBirthday;
    public TableColumn<Student, String> sAddress;
    public TableColumn<Student, String> sEmail;
    public TableColumn<Student, String> sPhoneNumber;
    public TableColumn<Student, String> sAction;

    public final static String connectionString = "jdbc:mysql://localhost:3306/fptlibrary";
    public final static String user = "root";
    public final static String password = "";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sName.setCellValueFactory(new PropertyValueFactory<>("StudentName"));
        sBirthday.setCellValueFactory(new PropertyValueFactory<>("DateOfBirth"));
        sAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        sEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        sPhoneNumber.setCellValueFactory(new PropertyValueFactory<>("PhoneNumber"));

        //set data from sql
        try {
            //gọi driver
            Class.forName("com.mysql.jdbc.Driver");
            //tạo connect
            Connection conn = DriverManager.getConnection(connectionString, user, password);
            //khai báo statement để truy vấn sql
            Statement stt = conn.createStatement();
            //truy vấn sql
            String txt_sql = "select * from students";
            ResultSet rs = stt.executeQuery(txt_sql);

            ObservableList<Student> list = FXCollections.observableArrayList();
            while(rs.next()){
                Student s = new Student(
                        rs.getInt("id"),
                        rs.getString("StudentName"),
                        Date.valueOf(rs.getString("DateOfBirth")),
                        rs.getString("Address"),
                        rs.getString("Email"),
                        rs.getString("PhoneNumber")
                );
                list.add(s);
            }
            tbStudents.setItems(list);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void backHome(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Main.rootStage.setScene(new Scene(root, 800, 600));
    }

    public void addStudent(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("StudentForm.fxml"));
        Main.rootStage.setScene(new Scene(root, 800,700));
    }

}
