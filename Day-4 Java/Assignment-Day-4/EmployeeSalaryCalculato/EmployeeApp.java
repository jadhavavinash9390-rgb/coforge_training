package EmployeeSalaryCalculato;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(101,"raju",35000);
		DisplayEmployee display = new DisplayEmployee();
		display.display(emp);

	}

}
