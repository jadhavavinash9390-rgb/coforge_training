package com.coforge.dms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coforge.dms.model.Department;
import com.coforge.dms.repo.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepo repo;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepo repo) {
        this.repo = repo;
    }

    @Override
    public boolean saveDepartment(Department department) {

        repo.save(department);
        return true;
    }

    @Override
    public boolean updateDepartment(int dno, Department department) {

        repo.save(department);
        return true;
    }

    @Override
    public boolean deleteByDno(int dno) {

        repo.deleteById(dno);
        return true;
    }

    @Override
    @Transactional
    public boolean deleteByDname(String dname) {

        repo.deleteByDname(dname);
        return true;
    }

    @Override
    public Optional<Department> getByDno(int dno) {

        Optional<Department> department = repo.findById(dno);
        return department;
    }

    @Override
    public List<Department> findAll() {

        return repo.findAll();
    }

    @Override
    public List<Department> findByDname(String dname) {

        return repo.findByDname(dname);
    }

    @Override
    public List<Integer> getDnosList() {

        return repo.getDnos();
    }

    @Override
    public String getInfo() {

        return repo.getInfo();
    }
}
