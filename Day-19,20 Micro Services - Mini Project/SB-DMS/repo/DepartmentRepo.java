package com.coforge.dms.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.coforge.dms.model.Department;

public interface DepartmentRepo extends JpaRepository<Department,Integer>{

    List<Department> findByDname(String dname);

    void deleteByDname(String dname);

    @Query("select d.dno from Department d")
    List<Integer> getDnos();

    @Query("select 'Department Management System'")
    String getInfo();

}