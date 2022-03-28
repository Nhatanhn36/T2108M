package Session3.Assignment3;

public class User {
    public String ten;
    public String email;
    public String soDT;
    public int tuoi;
    public Double soTien;
    Room room;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Double getSoTien() {
        return soTien;
    }

    public void setSoTien(Double soTien) {
        this.soTien = soTien;
    }
    public void checkSoTien(){
        Double giaThue = this.room.giaThue;
        if(soTien > giaThue){
            System.out.println("Người dùng " + ten + " đủ tiền để thuê phòng");
        }else{
            System.out.println("Người dùng " + ten + " không đủ tiền để thuê phòng");
        }
    }


}
