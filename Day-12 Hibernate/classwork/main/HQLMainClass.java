package com.coforge.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLMainClass {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		/*
		 * //HQL Select Query query = session.createQuery("from Employee");
		 * List<Employee> list = query.list(); System.out.println(list);
		 */

		// HQL Static select
		/*
		 * Query query = session.createQuery("from Employee where eid=9");//static
		 * because it will only run for one id always List<Employee> list =
		 * query.list(); System.out.println(list);
		 */

		// Hql Dynamic Select
		/*
		 * Query query = session.createQuery("from Employee where eid = : e");
		 * query.setParameter("e", 11); List<Employee> list = query.list();
		 * System.out.println(list);
		 */

		// HQL Specific Column Select
		/*
		 * Query query = session.createQuery("select ename from Employee"); List<String>
		 * list = query.list();//String because only employee name will return
		 * System.out.println(list);
		 */

		// HQL Update
		/*
		 * Query query =
		 * session.createQuery("update Employee set ename = :e  where eid = :x");
		 * query.setParameter("e", "olise"); query.setParameter("x", 11); int n =
		 * query.executeUpdate(); if(n == 1) {
		 * System.out.println("Employee Object Updated"); }else {
		 * System.out.println("Employee Object Not Updated"); }
		 */
		
		
		//Hql Delete
		 Query query = session.createQuery("delete from Employee where eid = :e");
		 query.setParameter("e", 201);
		  int n = query.executeUpdate(); 
		  if(n == 1) {
		  System.out.println("Employee Object Deleted");
		  }
		  else {
		 System.out.println("Employee Object Not Updated"); 
		 }
		
		transaction.commit();
		session.close();
		factory.close();
	}

}