package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee employee) ;

	public boolean updateEmployee(int eid, Employee employee) ;

	public boolean deleteByEid(int eid);

	public Optional<Employee> getByEid(int eid) ;

	public List<Employee> findAll();

	public List<Employee> findByEname(String ename) ;

	boolean deleteByEname(String ename) ;

	public List<Integer> getEidsList();

	public String getInfo();



}