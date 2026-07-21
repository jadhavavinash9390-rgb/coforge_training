package com.coforge.ems.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.coforge.ems.model.Employee;


@Repository

//public interface EmployeeRepo1 extends JpaRepository<Employee, Integer> {
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

	//CrudRepository AND Jpa repo(super interface) also another method 
	public List<Employee> findByEname(String ename);
	public void   deleteByEname(String ename);
	public List<Employee> findByDno(int dno);
	public int deleteByDno(int dno);
	
	
	//Query Methods or custom queries
	@Query("select eid from Employee")
	public List<Integer> getEids();
	
	@Query("select count(*),sum(esalary), min(esalary), max(esalary) from Employee")
	
	public String getInfo();
	
}
