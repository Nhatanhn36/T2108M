package Session3;

import Session2.SinhVien;
import Session3.demo1.Vietnamese;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList arl = new ArrayList();
        arl.add(1); //thêm một phần tử vào mảng
        arl.add("hello");
        arl.add(new SinhVien());

        //quy định rõ ràng kiểu dữ liệu của phần tử
        ArrayList<Integer> arrNum = new ArrayList<Integer>();
        arrNum.add(5);
        arrNum.add(2);
        //arrNum.add(3.14);
        //arrNum.add("hello");

        ArrayList<String> arrS = new ArrayList<>();
        arrS.add("Xin chào");

        System.out.println("arrNum[0]=" +arrNum.get(0)); //arrNum[0]
        System.out.println("arrS[0]=" +arrS.get(0));
        arrNum.remove(2); //xoá số 2 khỏi dòng

        ArrayList<SinhVien> arrSV = new ArrayList<>();
        arrSV.add(new SinhVien());

        Vietnamese v1 = new Vietnamese();
        //v1.telephone = "1111";
        Hanoi h = new Hanoi();
    }
}
