package com.coforge.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.ems.exception.EmployeeNotFoundException;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo repo;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public boolean saveEmployee(Employee employee)  {


			repo.save(employee);
								
			return true;
	}

	@Override
	public boolean updateEmployee(int eid, Employee employee) {

			repo.save(employee);
			return true;
	}

	@Override
	public boolean deleteByEid(int eid) {

		
			repo.deleteById(eid);
			return true;
	
	}
	
	@Override
	@Transactional
	public boolean deleteByEname(String ename) {


	        repo.deleteByEname(ename);
	        return true;

	}

	
	
	public Optional<Employee> getByEid(int eid) {

			Optional<Employee> employee = repo.findById(eid);
			Employee emp = employee.get();
					return employee;
	
	}
	
	public List<Employee> findAll() {
			List<Employee> list = (List<Employee>) repo.findAll();
					return list;
	}

	@Override
	public List<Employee> findByEname(String ename) {

	 

	        return repo.findByEname(ename);

	}

	@Override
	public List<Integer> getEidsList() {
		// TODO Auto-generated method stub
		List<Integer> eids = repo.getEids();
		return eids;
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		
		return repo.getInfo();
		
	}
}