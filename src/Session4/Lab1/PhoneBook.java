package Session4.Lab1;

import java.util.*;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> phoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        for(PhoneNumber p: phoneList){
            if(p.name == name){
                for(String s:p.phone){
                    if(s == phone){
                        return;
                    }
                }
                //số đt chưa có nhưng tên thì có
                p.phone.add(phone);
                return;
            }
        }
        //chưa có tên - thêm liên lạc mới
        phoneList.add(new PhoneNumber(name, phone));
    }

    @Override
    public void removePhone(String name) {
        for(PhoneNumber p: phoneList){
            if(p.name == name){
               phoneList.remove(p);
               return;
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for(PhoneNumber p:phoneList){
            if(p.name == name){
                p.phone.removeAll(p.phone);// xoa het
                p.phone.add(newphone);
                return;
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for(PhoneNumber p:phoneList){
            if(p.name == name){
//                System.out.println(p.name+":"+p.phone);
                return p;
            }
        }
        return null;
    }

    @Override
    public void sort() {
        //buble sort
        for(int i = 0; i<phoneList.size()-1; i++){
            for(int j = 0; j<phoneList.size()-i-1;j++){
                if(phoneList.get(j).name.compareTo(phoneList.get(j+1).name)>0){
                    PhoneNumber temp = phoneList.get(j);
                    phoneList.set(j,phoneList.get(j+1));
                    phoneList.set(j+1, temp);
                }
            }
        }

        //collections.sort
        //Collections.sort(phoneList, new Comparator<PhoneNumber>() {
        //    @Override
        //    public int compare(PhoneNumber o1, PhoneNumber o2) {
        //        return o1.name.compareTo(o2.name);
        //    }
        //});

        for(PhoneNumber p:phoneList){
            System.out.println(p.name + ": " + p.phone);
        }
    }
}
