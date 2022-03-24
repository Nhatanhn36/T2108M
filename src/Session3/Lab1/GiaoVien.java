package Session3.Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person {
    public String dsLop;
    public String luong;
    public int soMon;

    public String getDsLop() {
        return dsLop;
    }

    public void setDsLop(String dsLop) {
        this.dsLop = dsLop;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public int getSoMon() {
        return soMon;
    }

    public void setSoMon(int soMon) {
        this.soMon = soMon;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.println("Danh sach lop giang day: ");
        dsLop = sc.nextLine();
        System.out.println("Muc luong: ");
        luong = sc.nextLine();
        System.out.println("So mon giang day: ");
        soMon = sc.nextInt();
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.println("Danh sach lop: "+this.dsLop);
        System.out.println("Muc luong: "+this.luong);
        System.out.println("So mon giang day: "+this.soMon);
    }
}
