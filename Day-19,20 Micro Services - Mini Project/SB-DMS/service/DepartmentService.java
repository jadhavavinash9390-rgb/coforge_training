package com.coforge.dms.service;

import java.util.List;

import java.util.Optional;

import com.coforge.dms.model.Department;

public interface DepartmentService {

    boolean saveDepartment(Department department);

    boolean updateDepartment(int dno, Department department);

    boolean deleteByDno(int dno);

    Optional<Department> getByDno(int dno);

    List<Department> findAll();

    List<Department> findByDname(String dname);

    boolean deleteByDname(String dname);

   

    String getInfo();

	List<Integer> getDnosList();
	
	
}