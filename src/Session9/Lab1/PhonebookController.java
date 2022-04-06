package Session9.Lab1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class PhonebookController implements Initializable {
    public TableView<Contact> tbView;
    public TableColumn<Contact, String> cName;
    public TableColumn<Contact, String> cPhoneNumber;
    public TableColumn<Contact, Button> cEdit;
    public TableColumn<Contact, Button> cDelete;

    public TextField txtSearch;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cName.setCellValueFactory(new PropertyValueFactory<Contact, String>("name"));
        cPhoneNumber.setCellValueFactory(new PropertyValueFactory<Contact, String>("phoneNumber"));
        cEdit.setCellValueFactory(new PropertyValueFactory<Contact, Button>("edit"));
        cDelete.setCellValueFactory(new PropertyValueFactory<Contact, Button>("delete"));
        tbView.setItems(Main.contactList);
    }
    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("contact.fxml"));
        Main.rootStage.setScene(new Scene(root, 600, 500));
    }
    public void search(){
        String s = txtSearch.getText();
        List<Contact> kq = Main.contactList.stream()
                .filter(c->c.getName().contains(s))
                .collect(Collectors.toList());
        ObservableList result = FXCollections.observableArrayList();
        result.addAll(kq);
        tbView.setItems(result);
    }
}
