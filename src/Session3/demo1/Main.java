package Session3.demo1;

public class Main {
    public static void main(String[] args){
        Human h = new Human();
        h.name = "Nguyễn Nhật Anh";
        h.run();

        Asian a = new Asian();
        a.name = "Ching chong Hanji";
        a.run();
        a.say();

        Vietnamese v = new Vietnamese();
        v.name = "Nguyễn Văn An";
        v.run();
        v.say();

        v.telephone = "0123456";

        v.drink();
        v.drink(15);
        v.drink(3.14);

        Vietnamese v1 = new Vietnamese("098764321");

    }
}
