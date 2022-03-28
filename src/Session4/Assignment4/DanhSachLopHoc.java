package Session4.Assignment4;

import java.util.ArrayList;

public class DanhSachLopHoc {
    public ArrayList<String> lopHoc = new ArrayList<>();
    public String hocSinh;
    public boolean name;

    public DanhSachLopHoc(String hocSinh,String lopHoc){
        this.hocSinh = hocSinh;
        this.lopHoc.add(lopHoc);
    }
}
