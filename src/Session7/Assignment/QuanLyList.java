package Session7.Assignment;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class QuanLyList implements Initializable {
    public TableView<SanPham> tbView;
    public TableColumn<SanPham, String> cTenSP;
    public TableColumn<SanPham, Integer> cGiaSP;
    public TableColumn<SanPham, String> cDonVi;
    public TableColumn<SanPham, Integer> cSoLuongSP;
    public TableColumn<SanPham, Button> cDelete;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cTenSP.setCellValueFactory(new PropertyValueFactory<SanPham, String>("tenSP"));
        cGiaSP.setCellValueFactory(new PropertyValueFactory<SanPham, Integer>("giaSP"));
        cDonVi.setCellValueFactory(new PropertyValueFactory<SanPham, String>("donVi"));
        cSoLuongSP.setCellValueFactory(new PropertyValueFactory<SanPham, Integer>("soLuongSP"));
        cDelete.setCellValueFactory(new PropertyValueFactory<SanPham, Button>("delete"));
        tbView.setItems(Main.sanPhamList);
    }
    public void formScreen() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Form.fxml"));
        Main.rootStage.setScene(new Scene(root, 1200, 800));
    }
}
