package Session2;

import java.util.Scanner;

public class ClassRoom {
    String name;
    String room;
    String schoolName;

    public ClassRoom(){
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        this.room = sc.nextLine();
        this.schoolName = sc.nextLine();
    }

    public void khaiGiang(){
        System.out.println("Khai giang...");
    }
    public void thiHetMon(){
        System.out.println("Thi Het Mon..");
    }
    public void ketThuc(){
        System.out.println("Ket thuc..");
    }
}
