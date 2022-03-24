package Session3.Lab1;

import java.util.Scanner;

public class Person {
    public String name;
    public String gender;
    public String date;
    public String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap ten: ");
        name = sc.nextLine();
        System.out.println("Moi nhap gioi tinh: ");
        gender = sc.nextLine();
        System.out.println("Moi nhap ngay sinh: ");
        date = sc.nextLine();
        System.out.println("Moi nhap dia chi: ");
        address = sc.nextLine();
    }

    public void inThongTin(){
        System.out.println("Tên: "+ this.name );
        System.out.println("Giới tính: " +this.gender);
        System.out.println("Ngày sinh: " +this.date);
        System.out.println("Địa chỉ: " +this.address);
    }

    public Person(){

    }

    public Person(String name, String gender, String date, String address) {
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.address = address;
    }
}
