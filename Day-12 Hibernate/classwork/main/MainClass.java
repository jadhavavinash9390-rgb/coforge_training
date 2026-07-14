package com.coforge.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.coforge.model.Employee;

public class MainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee(11,"Leao",2000,103);
		//session.save(employee);   //Insert
		
		
		//session.update(employee);    //Update
		
		//Employee emp = session.get(Employee.class, 201);  //Select query 
		
		//System.out.println(emp);
		session.delete(employee);
		
		transaction.commit();
		session.close();
		factory.close();
		
		System.out.println("Employee Object Saved");
	}

}