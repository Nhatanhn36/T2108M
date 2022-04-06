package Session7.Assignment;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class QuanLyHangHoa {
    public Text thongTin;
    public TextField tenSP;
    public TextField giaSP;
    public TextField donVi;
    public TextField soLuongSP;
    public Text errMsg;

    public void submit(){
        try{
             SanPham sp = new SanPham(tenSP.getText(),Integer.parseInt(giaSP.getText()),donVi.getText(),Integer.parseInt(soLuongSP.getText()));
             Main.sanPhamList.add(sp);

            Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
            Main.rootStage.setScene(new Scene(root, 1200, 800));

             errMsg.setVisible(false);
        }catch (Exception e){
            errMsg.setVisible(true);
            errMsg.setText("Chưa nhập thông tin sản phẩm!");
        }
    }
    public void renderList(){
        String txt = "Information\n";
        for(SanPham sp : Main.sanPhamList){
            txt += sp.toString();
        }
        thongTin.setText(txt);
        tenSP.setText("");
        giaSP.setText("");
        donVi.setText("");
        soLuongSP.setText("");
    }
}
