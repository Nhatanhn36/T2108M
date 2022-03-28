package Session4.Assignment4;

import java.util.ArrayList;

public class MonHocDaiCuong extends MonHoc{
    public ArrayList<DanhSachLopHoc> danhSachLopHoc = new ArrayList();

    @Override
    public void themLopHoc(String name, int soluonghocsinh) {

    }

    @Override
    public void xoaLopHoc(String name) {
        for(DanhSachLopHoc ds:danhSachLopHoc){
            if(ds.hocSinh == name){

            }
        }
    }

    @Override
    public void sapXep() {

    }

    @Override
    public void inDanhSach() {

    }
}
