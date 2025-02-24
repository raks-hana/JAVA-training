package task8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Task2 {
    static String url = "jdbc:mysql://localhost:3306/bmdb";
    static String username = "root";
    static String password = "raksha@2020";
    public static void main(String[] args) throws SQLException  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Id: ");
        int id = sc.nextInt();
        System.out.println("Enter new Name: ");
        String name = sc.next();
        updateStudent(id,name);
    }
    public static void updateStudent(int sid, String sname) throws SQLException  {
        String query = "update students set stuName=? where stuId=?;";
        Connection connect = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setString(1,sname);
        pst.setInt(2,sid);
        System.out.println("Number of rows affected:" +pst.executeUpdate());
        connect.close();
    }
}
