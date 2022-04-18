package Library;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class HomeController{

    public void studentModule(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("StudentsPage.fxml"));
        Main.rootStage.setScene(new Scene(root, 1000, 700));
    }
    public void bookModule(ActionEvent event) {

    }

    public void rentModule(ActionEvent event) {
    }

}
