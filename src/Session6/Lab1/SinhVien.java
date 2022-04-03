package Session6.Lab1;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public final class SinhVien{
    public Integer id;
    public String name, address;
    public Double gpa;
    public Date dateOfBirth;
    Scanner sc = new Scanner(System.in);

    public SinhVien(){

    }

    public SinhVien(Integer id, String name, String address, Double gpa, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.gpa = gpa;
        this.dateOfBirth = dateOfBirth;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public void addStudent(){
        System.out.println("Enter Student ID: ");
        id = sc.nextInt();
        System.out.println("Enter Student name: ");
        name = sc.nextLine();
        System.out.println("Enter Student address: ");
        address = sc.nextLine();
        System.out.println("Enter Student GPA: ");
        gpa = sc.nextDouble();
        System.out.println("Enter Student Date of Birth: ");

    }

    //public void editStudent(){
    //    for(){

    //    }
    //}
}
