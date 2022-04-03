package Session5.Lab2;

public class KHNuocNgoai extends KhachHang{
    private String quocTich;

    public KHNuocNgoai(){
        super();
        this.quocTich = "";
    }

    public KHNuocNgoai (String maKH, String name, String ngayRaHoaDon, double donGia, double thanhTien, int soLuong, String quocTich){
        super(maKH, name, ngayRaHoaDon, donGia, thanhTien, soLuong);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Moi nhap quoc tich: ");
        quocTich = sc.nextLine();
    }

    public double thanhTien(){
        return this.thanhTien = this.soLuong * this.donGia;
    }
    public void inHoaDon(){
        System.out.println("Khách hàng nước ngoài: ");
        super.inHoaDon();
        System.out.println("Quốc tịch :" + quocTich + " ,Thành tiền: " + thanhTien);
    }
}
