package com.coforge.ems.ui;

import java.util.Scanner;

import com.coforge.ems.controller.EmployeeController;
import com.coforge.ems.model.Employee;

public class EmployeeApp {

    private static EmployeeController controller = new EmployeeController();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("\n========================================");
            System.out.println(" EMPLOYEE MANAGEMENT SYSTEM ");
            System.out.println("========================================");
            System.out.println("1. Insert Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Find Employee");
            System.out.println("5. Find All Employees");
            System.out.println("6. Exit");
            System.out.println("========================================");
            System.out.print("Enter Your Choice : ");

            choice = scanner.nextInt();

            switch (choice) {


            case 1:

                System.out.print("Enter Employee Id : ");
                int eid = scanner.nextInt();

                System.out.print("Enter Employee Name : ");
                String ename = scanner.next();

                System.out.print("Enter Salary : ");
                int salary = scanner.nextInt();

                System.out.print("Enter Department No : ");
                int dno = scanner.nextInt();

                Employee employee = new Employee(eid, ename, salary, dno);

                System.out.println(controller.createEmployee(employee));

                break;


            case 2:

                System.out.print("Enter Employee Id : ");
                eid = scanner.nextInt();

                System.out.print("Enter New Employee Name : ");
                ename = scanner.next();

                System.out.print("Enter New Salary : ");
                salary = scanner.nextInt();

                System.out.print("Enter New Department No : ");
                dno = scanner.nextInt();

                employee = new Employee(eid, ename, salary, dno);

                System.out.println(controller.updateEmployee(employee));

                break;

                
            case 3:

                System.out.print("Enter Employee Id : ");
                eid = scanner.nextInt();

                System.out.println(controller.deleteEmployee(eid));

                break;


            case 4:

                System.out.print("Enter Employee Id : ");
                eid = scanner.nextInt();

                System.out.println(controller.findEmployee(eid));

                break;


            case 5:

                System.out.println(controller.findAllEmployee());

                break;

            case 6:

                System.out.println("Thank You... Visit Again.");

                break;

            default:

                System.out.println("Invalid Choice.");

            }

        } while (choice != 6);

        scanner.close();
    }
}