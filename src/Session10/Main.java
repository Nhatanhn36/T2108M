package Session10;

import java.io.*;

public class Main {
    public static void main(String[] args){
        //Write file
        try {
            FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeBytes("Hello T2108M\n");
            dos.writeBytes("Day la mon JP1\n");
            dos.writeBytes("Thu 4 tuan sau se thi het mon\n");

            //read file
            FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis);
            String txt = dis.readLine();
            while(txt != null){
                System.out.println(txt);
                txt = dis.readLine();
            }

        }catch(FileNotFoundException f){
            System.out.println("File not found");
        }catch (IOException io){
            System.out.println("Error..");
        }
    }
}
