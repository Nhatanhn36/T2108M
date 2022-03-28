package Session4;

import java.util.ArrayList;

public class Main {
    public int year;
    public static int numberYear;

    public static void main(String[] args){
        System.out.println("Hello world!");
        Main.numberYear = 20;
        Main m = new Main();
        m.year = 2022;
        m.sayHello();

        Main.reading();
        int x; //x=0
        Main ma; //null
        ma = new Main(); //có ô nhớ => biến phải có giá trị thì mới có
        ArrayList<String> arr;
        arr = new ArrayList<>();
        arr.add("aaa");


    }

    public void sayHello(){
        Main.reading();
    }
    public void go(){
        this.sayHello();
    }
    public static void reading(){
        //trong static ko có this

    }
}
