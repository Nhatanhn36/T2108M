package Session2;

public class Main {
    public static void main(String[] args){
        int x;
        SinhVien sv = new SinhVien();
        sv.age = 20;
        x = 10;
        SinhVien maivannam = new SinhVien();
        ClassRoom c = new ClassRoom();
        sv.myClass = c;
        sv.study();
        maivannam.study();
    }
}
