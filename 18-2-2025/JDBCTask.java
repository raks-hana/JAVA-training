package Techmm1;

import java.sql.*;
import java.util.Scanner;

public class JDBCTask {
    String url = "jdbc:mysql://localhost:3306/bmdb";
    String user = "root";
    String password = "raksha@2020";
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        JDBCTask jt = new JDBCTask();
//        System.out.println("1 - To see the student details");
//        System.out.println("2 - To insert a student detail row");
//        System.out.println("3 - To update the student detail");
//        System.out.println("4 - To delete a student detail row");
//        System.out.println("Enter the operation you want to perform: ");
        //int choiceint = sc.nextInt();
//        switch (choiceint) {
//            case 1:
//                jt.studentDetails();
//                break;
//            case 2:
//                jt.studentInsert();
//                jt.studentDetails();
//                break;
//            case 3:
//                System.out.print("Enter student ID: ");
//                int id = sc.nextInt();
//                System.out.print("Enter student new roll no: ");
//                int rollNo = sc.nextInt();
//                jt.studentUpdate(id,rollNo);
//                jt.studentDetails();
//                break;
//            case 4:
//                System.out.print("Enter student ID: ");
//                int id1 = sc.nextInt();
//                jt.studentDelete(id1);
//                jt.studentDetails();
//                break;
//            default:
//                System.out.println("Invalid choice");
//        }
        System.out.println("Read - To see the student details");
        System.out.println("Insert - To insert a student detail row");
        System.out.println("update - To update the student detail");
        System.out.println("delete - To delete a student detail row");
        System.out.println("Enter the operation you want to perform: ");

        String choicestr = sc.next().toLowerCase();

        switch (choicestr) {
            case "read":
                jt.studentDetails();
                break;
            case "insert":
                jt.studentInsert();
                jt.studentDetails();
                break;
            case "update":
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                System.out.print("Enter student new roll no: ");
                int rollNo = sc.nextInt();
                jt.studentUpdate(id,rollNo);
                jt.studentDetails();
                break;
            case "delete":
                System.out.print("Enter student ID: ");
                int id1 = sc.nextInt();
                jt.studentDelete(id1);
                jt.studentDetails();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }
    public void studentDetails() throws SQLException {
        String sql = "select * from students";
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        System.out.print("Student Details : ");
        while (rs.next()) {
            System.out.print("\nID: " + rs.getInt(1));
            System.out.print("\nName: " + rs.getString(2));
            System.out.print("\nStudent Class: " + rs.getString(3));
            System.out.print("\nRoll No: " + rs.getInt(4));
            System.out.print("\nGender: " + rs.getString(5));
            System.out.println("\nDOB: " + rs.getString(6));
        }
        conn.close();
    }
    public void studentInsert() throws SQLException {
        String query = "insert into students values (4,'Dill','5-A',114,'female','13-4-2004');";
        Connection connect = DriverManager.getConnection(url,user,password);
        Statement st = connect.createStatement();
        int row = st.executeUpdate(query);
        System.out.println("Number of rows affected:"+row);
        connect.close();
    }
    public void studentDelete(int id) throws SQLException {
        String query = "delete from students where stuid=?;";
        Connection connect = DriverManager.getConnection(url,user,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,id);
        System.out.println("Number of rows affected:"+pst.executeUpdate());
        connect.close();
    }
    public void studentUpdate(int id, int rollno) throws SQLException {
        String query = "update students set sturollno=? where stuid=?;";
        Connection connect = DriverManager.getConnection(url,user,password);
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1,rollno);
        pst.setInt(2,id);
        System.out.println("Number of rows affected:"+pst.executeUpdate());
        connect.close();
    }
}
