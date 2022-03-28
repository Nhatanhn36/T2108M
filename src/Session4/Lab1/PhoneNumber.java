package Session4.Lab1;

import java.util.ArrayList;

public class PhoneNumber {
    public String name;
    public ArrayList<String> phone = new ArrayList<String>();


    public PhoneNumber(String name,String phone) {
        this.name = name;
        this.phone.add(phone);
    }
}
