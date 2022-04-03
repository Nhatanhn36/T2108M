package Session5.Lab2;

import java.util.Scanner;

public class KhachHang {
    String maKH, name, ngayRaHoaDon;
    double donGia, thanhTien;
    int soLuong;
    Scanner sc = new Scanner(System.in);

    public KhachHang(){
        this.maKH = "";
        this.donGia = 0;
        this.ngayRaHoaDon = "";
        this.name = "";
        this.soLuong = 0;
    }

    public KhachHang(String maKH, String name, String ngayRaHoaDon, double donGia, double thanhTien, int soLuong) {
        this.maKH = maKH;
        this.name = name;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
        this.soLuong = soLuong;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void nhap(){
        System.out.println("Nhập mã Khách hàng: ");
        maKH = sc.nextLine();
        System.out.println("Ten Khach Hang: ");
        name = sc.nextLine();
        System.out.println("Ngay Lap Hoa Don: ");
        ngayRaHoaDon = sc.nextLine();
        System.out.println("So Luong(KW): ");
        soLuong = sc.nextInt();
        System.out.println("Don gia: ");
        donGia = sc.nextInt();

    }

    public void inHoaDon(){
        System.out.println("[Mã KH: " + maKH + " ,Tên KH: " + name + " ,Ngày lập hoá đơn: " + ngayRaHoaDon + " ,Số lượng: " + soLuong + " ,Đơn giá :" +donGia + "]");
    }
}
