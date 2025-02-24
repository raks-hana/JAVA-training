package task2;

import java.util.Scanner;

public class Employee {
    private int empId;
    private String empName;
    private double sal; 
    private int Workexp;

    public void setEmployeeDetails(int empId, String empName, double sal, int Workexp) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
        this.Workexp = Workexp;
    }

    public void getEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Monthly Salary: " + sal);
        System.out.println("Annual Salary: " + (sal * 12));
        System.out.println("Years of Experience: " + Workexp);
    }

    public void getLoanEligibility() {
        if (Workexp <= 5) {
            System.out.println(empName + " is not eligible for a loan (must have >5 years experience).");
            return;
        }

        double annualSalary = sal * 12;
        double loanAmount = 0;

        if (annualSalary >= 15_00_000) {
            loanAmount = 7_00_000;
        } else if (annualSalary >= 10_00_000) {
            loanAmount = 5_00_000;
        } else if (annualSalary >= 6_00_000) {
            loanAmount = 2_00_000;
        }

        if (loanAmount > 0) {
            System.out.println(empName + " is eligible for a loan of ₹" + loanAmount);
        } else {
            System.out.println(empName + " is not eligible for a loan.");
        }
    }
}
