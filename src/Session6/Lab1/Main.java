package Session6.Lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //public static ArrayList DSSinhVien(){}

    public static void main(String[] args){
        SinhVien sv;
        sv = new SinhVien();
        Scanner sc = new Scanner(System.in);
        int x ;
        do {
            System.out.println("------Menu------");
            System.out.println("1.Add Student");
            System.out.println("2.Edit Student by ID");
            System.out.println("3.Delete Student by ID");
            System.out.println("4.Sort student by GPA");
            System.out.println("5.Sort student by name");
            System.out.println("6.Show Student");
            System.out.println("0.Exit");
            System.out.println("Please choose an action: ");
            x = sc.nextInt();
            System.out.println("Running...");
            switch (x){
                case 1:
                    sv.addStudent();
                    break;
                case 2:

            }
        }while (x != 0);


    }
}
