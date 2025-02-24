package task2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Monthly Salary: ");
        double sal = sc.nextDouble();

        System.out.print("Enter Years of Experience: ");
        int Workexp = sc.nextInt();

        Employee emp = new Employee();
        emp.setEmployeeDetails(empId, empName, sal, Workexp);

        emp.getEmployeeDetails();
        emp.getLoanEligibility();

        sc.close();
    }
}
