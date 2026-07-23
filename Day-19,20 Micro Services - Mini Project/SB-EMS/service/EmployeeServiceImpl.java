package com.coforge.ems.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.ems.dto.DepartmentDTO;
import com.coforge.ems.model.Employee;
import com.coforge.ems.repo.EmployeeRepo;
import com.coforge.service.client.DepartmentClient;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo repo;
	private Environment environment;
	private DepartmentClient client;

	

	@Autowired
	public EmployeeServiceImpl(EmployeeRepo repo, Environment environment, DepartmentClient client) {
		super();
		this.repo = repo;
		this.environment = environment;
		this.client = client;
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

	@Override
	public DepartmentDTO findDepartmentById(int dno) {

	    DepartmentDTO department = client.findDepartmentById(dno);

	    return department;
	}

	@Override
	public List<DepartmentDTO> findAllDepartment() {
		// TODO Auto-generated method stub
		List<DepartmentDTO> department = client.findAllDepartment();
		return department;
	}

	
}