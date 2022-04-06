package Session7.Assignment;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static ObservableList<SanPham> sanPhamList = FXCollections.observableArrayList();

    public static Stage rootStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        rootStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
        primaryStage.setTitle("T2108M");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        sanPhamList.add(new SanPham("Nhật ký Legami", 35000, "Quyển", 100));
        sanPhamList.add(new SanPham("Nhật ký Forbes", 50000, "Quyển", 250));
        sanPhamList.add(new SanPham("Tropical Leaves | Hanging wall Calendar", 125000, "Cuốn", 325));
        sanPhamList.add(new SanPham("Vitamin Sea Coastal Calendar 2022", 115000, "Cuốn", 95));
        launch(args);
    }
}