package EmployeeSalaryCalculato;

public class Employee {
	private int empID;
	private String empName;
	private int empmonthlySalary;
	
	public Employee (int empID, String empName, int empmonthlySalary) {
		this.empID = empID;
		this.empName = empName;
		this.empmonthlySalary = empmonthlySalary;
		
	}

	public int getEmpID() {
		return empID;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpmonthlySalary() {
		return empmonthlySalary;
	}
	

}
