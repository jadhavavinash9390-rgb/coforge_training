package EmployeeSalaryCalculato;

public class DisplayEmployee {
	public void display(Employee emp) {

        AnnualSalary salary = new AnnualSalary();

        System.out.println("Employee ID      : " + emp.getEmpID());
        System.out.println("Employee Name    : " + emp.getEmpName());
        System.out.println("Monthly Salary   : " + emp.getEmpmonthlySalary());
        System.out.println("Annual Salary    : " + salary.calculate(emp));
    }

}
