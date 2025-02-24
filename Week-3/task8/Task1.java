package task8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Task1 {
    static String url = "jdbc:mysql://localhost:3306/bmdb";
    static String username = "root";
    static String password = "raksha@2020";
    public static void main(String[] args) throws SQLException  {
        insertStudent(1,"Ama",5,1);
        insertStudent(2,"Bma",5,2);
        insertStudent(3,"Cma",5,3);
    }
    public static void insertStudent(int sid, String sname, int sclass, int srollno) throws SQLException  {
        String query = "insert into students values(?,?,?,?);";
        Connection connect = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,sid);
        pst.setString(2,sname);
        pst.setInt(3,sclass);
        pst.setInt(4,srollno);
        System.out.println("Number of rows affected:" +pst.executeUpdate());
        connect.close();
    }
}
