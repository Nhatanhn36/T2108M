package Session3.Lab1;

public class Main {
    public static void main(String[] args){
        Student s = new Student();
        GiaoVien gv = new GiaoVien();
        System.out.println("\t\tVui long nhap thong tin sinh vien: \n");
        s.nhapThongTin();
        System.out.println("\t\tVui long nhap thong tin giao vien: \n");
        gv.nhapThongTin();

        System.out.println("\t\tThong tin cua sinh vien: \n");
        s.inThongTin();
        s.checkDiemThi();
        System.out.println("\t\tThong tin cua giao vien: \n");
        gv.inThongTin();

    }
}
