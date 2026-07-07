package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCUpdateTest {

	public static void main(String[] args) throws Exception {
		
		
		//step-1: loading driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step-2: connection with DB
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
		
		//step-3: Creating Statement
		
		String sql = "UPDATE employee1 SET esalary=?, ename=? WHERE eid=?";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//step-3: Executing the query
		
		 statement.setInt(1, 60000);      // New Salary
	     statement.setString(2, "Sunil"); // New Name
	     statement.setInt(3, 101);
		
		
		int n = statement.executeUpdate(); // execute use for INSERT, DELETE & UPDATE
		if(n == 1) {
			System.out.println("Employe datails saved");
		}else {
			System.out.println("Employe datails not updated");
		}
		
		//step-4: Connection closing
		statement.close();
		connection.close();
		
		

	}

}
