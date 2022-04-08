package Session10;

import java.sql.*;

public class DemoSQL {
    //tạo các string kết nối
    public final static String connectionString = "jdbc:mysql://localhost:3306/t2108m";
    public final static String user = "root";
    public final static String password = "";

    public static void main(String[] args){
        try {
            //gọi driver
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(connectionString,user,password);
            //khai báo statement để truy vấn sql
            Statement stt = conn.createStatement();
            //truy vấn sql
            String txt_sql = "select * from person";
            ResultSet rs = stt.executeQuery(txt_sql);

            while (rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("fullname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getInt("age"));
            }

            String insert_sql = "insert into person(fullname,email,age) values('Hoa','hoa@gmail.com',20)";
            stt.execute(insert_sql);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
