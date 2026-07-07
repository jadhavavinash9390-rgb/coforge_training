package com.coforge.ems.service;

import java.sql.SQLException;
import java.util.List;

import com.coforge.ems.dao.EmployeeDAO;
import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;

public class EmployeeService {

    private EmployeeDAO dao = new EmployeeDAO();


    public int createEmployee(Employee employee)
            throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {

        if (employee != null &&
            employee.getEid() > 0 &&
            employee.getEname() != null &&
            !employee.getEname().trim().isEmpty() &&
            employee.getEsalary() > 0 &&
            employee.getDno() > 0) {

            return dao.createEmployee(employee);
        }

        throw new InvalidEmployeeObjectException();
    }


    public int updateEmployee(Employee employee)
            throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {

        if (employee != null &&
            employee.getEid() > 0 &&
            employee.getEname() != null &&
            !employee.getEname().trim().isEmpty() &&
            employee.getEsalary() > 0 &&
            employee.getDno() > 0) {

            return dao.updateEmployee(employee);
        }

        throw new InvalidEmployeeObjectException();
    }


    public int deleteEmployee(int eid)
            throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {

        if (eid > 0) {
            return dao.deleteEmployee(eid);
        }

        throw new InvalidEmployeeObjectException();
    }


    public Employee findEmployee(int eid)
            throws ClassNotFoundException, SQLException, InvalidEmployeeObjectException {

        if (eid > 0) {
            return dao.findEmployee(eid);
        }

        throw new InvalidEmployeeObjectException();
    }


    public List<Employee> findAllEmployee()
            throws ClassNotFoundException, SQLException {

        return dao.findAllEmployee();
    }
}