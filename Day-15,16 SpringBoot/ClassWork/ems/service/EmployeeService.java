package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee employee) throws InvalidEmployeeObjectException;

	public boolean updateEmployee(int eid, Employee employee) throws InvalidEmployeeObjectException, EmployeeNotFoundException;

	public boolean deleteByEid(int eid)throws InvalidEmployeeObjectException, EmployeeNotFoundException;

	public Optional<Employee> getByEid(int eid) throws InvalidEmployeeObjectException, EmployeeNotFoundException;

	public List<Employee> findAll();

	public List<Employee> findByEname(String ename) throws InvalidEmployeeObjectException;

	boolean deleteByEname(String ename) throws InvalidEmployeeObjectException;

	public List<Integer> getEidsList();

	public String getInfo();



}