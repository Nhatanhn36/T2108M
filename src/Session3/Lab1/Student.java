package Session3.Lab1;


import java.util.Scanner;

public class Student extends Person{
    String maSV;
    Double diemThi;
    String email;

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ma SV: ");
        maSV = sc.nextLine();
        System.out.println("Moi nhap email: ");
        email = sc.nextLine();
        System.out.println("Moi nhap diem thi: ");
        diemThi = sc.nextDouble();
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.println("Mã SV: "+ maSV);
        System.out.println("Email: "+ email);
        System.out.println("Điểm thi: " +diemThi);
    }

    public void checkDiemThi(){
        if(this.diemThi>8.0){
            System.out.println(this.name + " được nhận học bổng.");
        }else{
            System.out.println(this.name + " ko được nhận học bổng.");
        }
    }
}
