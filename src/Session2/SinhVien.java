package Session2;

import java.util.Scanner;

public class SinhVien { //khai báo một lớp SinhVien
    String name;
    int age;
    ClassRoom myClass;

    public SinhVien(){ //constructor
        System.out.println("Nhap ten sv: ");
        this.inputName();
    }

    void study(){
        System.out.println(this.name + " lop: " +this.myClass.name + " Studying, tai phong: " + this.myClass.room);
    }
    void inputName(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
    }
}
