package Session7.Assignment;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class QuanLyHangHoa {
    public TextArea thongTin;
    public TextField tenSP;
    public TextField giaSP;
    public TextField donVi;
    public TextField soLuongSP;
    public Text errMsg;

    public void submit(){
        try{
             SanPham sp = new SanPham(tenSP.getText(),giaSP.getText(),donVi.getText(),Integer.parseInt(soLuongSP.getText()));
             thongTin.setText(thongTin.getText()+"\n"+sp.toString());

             tenSP.setText("");
             giaSP.setText("");
             donVi.setText("");
             soLuongSP.setText("");

             errMsg.setVisible(false);
        }catch (Exception e){
            errMsg.setVisible(true);
            errMsg.setText(e.getMessage());
        }
    }
}
