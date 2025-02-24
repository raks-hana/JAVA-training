package task8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Task3 {
    static String url = "jdbc:mysql://localhost:3306/bmdb";
    static String username = "root";
    static String password = "raksha@2020";
    public static void main(String[] args) throws SQLException  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id to delete: ");
        int id = sc.nextInt();
        deleteStudent(id);
    }
    public static void deleteStudent(int sid) throws SQLException  {
        String query = "delete from students where stuid=?;";
        Connection connect = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,sid);
        System.out.println("Number of rows affected:" +pst.executeUpdate());
        connect.close();
    }
}
