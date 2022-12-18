package com.bridgelabz.fileio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    Scanner scr = new Scanner(System.in);
    ArrayList<EmployeePayroll> employeePayrolls = new ArrayList<>();

    public static void main(String[] args) {
        EmployeePayrollService service = new EmployeePayrollService();
        service.readData();
        service.writeData();

    }

    public void readData(){
        EmployeePayroll employeePayroll = new EmployeePayroll();
        System.out.println("Enter Employee id: ");
         employeePayroll.setId(scr.nextInt());
        System.out.println("Enter Employee Name: ");
        employeePayroll.setName(scr.next());
        System.out.println("Enter Employee Salary: ");
        employeePayroll.setSalary(scr.nextInt());
        employeePayrolls.add(employeePayroll);

    }

    public void writeData(){
        System.out.println(employeePayrolls);
    }
}
