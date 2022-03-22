package Session2.TamGiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        TamGiac canh = new TamGiac();
        Scanner sc = new Scanner(System.in);
        canh.canhA = sc.nextInt();
        canh.canhB = sc.nextInt();
        canh.canhC = sc.nextInt();
        System.out.println("Chu vi của tam giác là: " + canh.tinhChuVi());
        System.out.println("Diện tích của tam giác là: " + canh.tinhDienTich());
    }

}
