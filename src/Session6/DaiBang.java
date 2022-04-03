package Session6;

public class DaiBang extends Animal {
    @Override
    public void run() {

    }
    public DaiBang fly(){
        System.out.println("Dai bang fly");
        return this; //khi thực thi xong hàm này, thì có thể thực thi các hàm khác ngay lập tức
    }

    public DaiBang fly2(){
        System.out.println("Fly 2..");
        return this;
    }

}
