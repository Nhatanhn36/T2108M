package Session4.Lab1;

public class Main {
    public static void main(String[] args){
        PhoneBook pb = new PhoneBook();

        System.out.println("Insert");
        pb.insertPhone("Duy","097466213");
        pb.insertPhone("Duy","097488524");

        pb.insertPhone("Lan","035975168");
        pb.insertPhone("Hưng","078464138");
        pb.insertPhone("Đại","078478542");
        pb.insertPhone("Tuấn","098564741");

        for(PhoneNumber pn: pb.phoneList){
            System.out.println(pn.name);
            System.out.println(pn.phone);
        }

        pb.removePhone("Tuấn");

        pb.updatePhone("Hưng","075412985");

        pb.searchPhone("Đại");

        pb.sort();

    }
}
