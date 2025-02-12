package Techmm1;

import java.io.*;
import java.util.Scanner;

public class Employee implements Serializable {
    int eno;
    String ename;
    transient String email;

    Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    Employee(int eno, String ename, String email) {
        this.eno = eno;
        this.ename = ename;
        this.email = email;
    }
}

class CallSerialDeserial{
    public void callSerial() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter eno: ");
        int eno = sc.nextInt();
        System.out.println("Enter ename: ");
        String ename = sc.next();
        try {
            Employee em = new Employee(eno,ename);
            FileOutputStream fos = new FileOutputStream("Employee.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(em);
            oos.flush();
            oos.close();
            System.out.println("Employee file created");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void callDeserial() throws IOException {
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Employee.txt"));
            Employee em = (Employee) ois.readObject();
            System.out.println("Employee id: " + em.eno+" Employee Name: " + em.ename);
            ois.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class ToCall{
    public static void main(String[] args) throws IOException {
        CallSerialDeserial cs = new CallSerialDeserial();
        cs.callSerial();
        System.out.println("Employee deatils are: ");
        cs.callDeserial();
    }
}
