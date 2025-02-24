package task8;

import java.sql.*;
import java.util.Scanner;

public class Task4 {
    static String url = "jdbc:mysql://localhost:3306/bmdb";
    static String username = "root";
    static String password = "raksha@2020";

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert - To insert a student detail row");
        System.out.println("update - To update the student detail");
        System.out.println("delete - To delete a student detail row");
        System.out.println("Select - To select a student detail row");
        System.out.println("Enter the operation you want to perform: ");
        String choice = sc.next().toLowerCase();

        switch (choice) {
            case "insert":
                System.out.println("Enter Student ID: ");
                int studentID = sc.nextInt();
                System.out.println("Enter Student Name: ");
                String studentName = sc.next();
                System.out.println("Enter Student Class: ");
                int studentClass = sc.nextInt();
                System.out.println("Enter Student Rollno: ");
                int studentRollno = sc.nextInt();
                insertStudent(studentID, studentName,studentClass, studentRollno);
                break;
            case "update":
                System.out.println("Enter Id: ");
                int id = sc.nextInt();
                System.out.println("Enter new Name: ");
                String name = sc.next();
                updateStudent(id,name);
                break;
            case "delete":
                System.out.println("Enter Id to delete: ");
                int id1 = sc.nextInt();
                deleteStudent(id1);
                break;
            case "select":
                System.out.println("Enter Student ID: ");
                int id2 = sc.nextInt();
                selectStudent(id2);
                break;
            default:
                System.out.println("Exit");
                break;
        }
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
    public static void updateStudent(int sid, String sname) throws SQLException  {
        String query = "update students set stuName=? where stuId=?;";
        Connection connect = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setString(1,sname);
        pst.setInt(2,sid);
        System.out.println("Number of rows affected:" +pst.executeUpdate());
        connect.close();
    }
    public static void deleteStudent(int sid) throws SQLException  {
        String query = "delete from students where stuid=?;";
        Connection connect = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,sid);
        System.out.println("Number of rows affected:" +pst.executeUpdate());
        connect.close();
    }
    public static void selectStudent(int sid) throws SQLException  {
        String query = "select * from students where stuid=?;";
        Connection connect = DriverManager.getConnection(url,username,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,sid);
        System.out.println("Number of rows affected:" +pst.executeUpdate());
        connect.close();
    }
}
