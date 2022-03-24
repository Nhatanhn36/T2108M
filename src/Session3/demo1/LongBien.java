package Session3.demo1;

public class LongBien extends Vietnamese {
    public void eat(){
        System.out.println("Tel: " +this.telephone);
    }

    public void drink(){
        System.out.println("Drink beer Hanoi");
    }

    public void study(){
        super.study();
        super.drink();
        this.drink();
        System.out.println("LB Study");
    }
}
