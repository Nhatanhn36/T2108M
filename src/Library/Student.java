package Library;

import java.sql.Date;

public class Student {
    public Integer id;
    public String StudentName;
    public java.sql.Date DateOfBirth;
    public String Address;
    public String email;
    public String PhoneNumber;

    public Student(Integer id, String studentName, Date dateOfBirth, String address, String email, String phoneNumber) {
        this.id = id;
        this.StudentName = studentName;
        this.DateOfBirth = dateOfBirth;
        this.Address = address;
        this.email = email;
        this.PhoneNumber = phoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
