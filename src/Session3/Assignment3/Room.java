package Session3.Assignment3;

import java.util.ArrayList;

public class Room {
    public String tenPhong;
    public String viTri;
    public Double giaThue;
    public ArrayList dsUser = new ArrayList();

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public Double getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(Double giaThue) {
        this.giaThue = giaThue;
    }

    public ArrayList getDsUser() {
        return dsUser;
    }

    public void setDsUser(ArrayList dsUser) {
        this.dsUser = dsUser;
    }

    public Room(){

    }

    public Room(String tenPhong, String viTri, Double giaThue, ArrayList dsUser) {
        this.tenPhong = tenPhong;
        this.viTri = viTri;
        this.giaThue = giaThue;
        this.dsUser = dsUser;
    }


    public void display(){
        System.out.println("Thông tin phòng:");
        System.out.println("Tên phòng " + this.tenPhong);
        System.out.println("Vị trí: " + this.viTri);
        System.out.println("Giá thuê: " + this.giaThue);
        System.out.println("Danh sách người thuê: " + this.dsUser);
    }

    public void display2(){
        System.out.println("Tên phòng " + this.tenPhong);
        System.out.println("Vị trí: " + this.viTri);
        System.out.println("Giá thuê: " + this.giaThue);
        if(dsUser == null){
            System.out.println("Không có người thuê.");
        }else{
            System.out.println("Danh sách người thuê: " + this.dsUser);
        }
    }
}
