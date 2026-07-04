package EmployeeSalaryCalculato;

public class AnnualSalary {
	public double calculate(Employee emp) {
		return emp.getEmpmonthlySalary() * 12;
	}

}
