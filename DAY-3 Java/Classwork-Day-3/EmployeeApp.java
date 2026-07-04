package com.coforge.dy3;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee bunny = new Employee(101, "bunny", 2000.0);
		bunny.display();
		
		bunny.setSalary(6000);
		bunny.display();
		
		Employee abhi = new Employee(102, "abhi", 3000.0);
		abhi.display();
		
		Employee raj = new Employee(103, "raj", 4000.0);
		raj.display();

	}

}
