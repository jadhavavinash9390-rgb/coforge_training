package com.coforge.day5.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsert {

	public static void main(String[] args) throws Exception {
		
		
		//step-1: loading driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//step-2: connection with DB
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "root");
		
		//step-3: Creating Statement
		
		String sql = "insert into Employee1 values(?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		//step-3: Executing the query
		
		statement.setInt(1, 105);
		statement.setString(2, "akash");
		statement.setInt(3, 10000);
		statement.setInt(4, 10);
		
		int n = statement.executeUpdate(); // execute use for INSERT, DELETE & UPDATE
		if(n == 1) {
			System.out.println("Employe datails saved");
		}else {
			System.out.println("Employe datails not saved");
		}
		
		//step-4: Connection closing
		statement.close();
		connection.close();
		
		

	}

}
