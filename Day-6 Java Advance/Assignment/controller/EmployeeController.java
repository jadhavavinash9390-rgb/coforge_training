package com.coforge.ems.controller;

import java.sql.SQLException;

import com.coforge.ems.exception.InvalidEmployeeObjectException;
import com.coforge.ems.model.Employee;
import com.coforge.ems.service.EmployeeService;
import com.coforge.ems.util.ApplicationProperties;

public class EmployeeController {

    private EmployeeService service = new EmployeeService();


    public String createEmployee(Employee employee) {

        try {

            int n = service.createEmployee(employee);

            if (n == 1)
                return ApplicationProperties.INSERT_SUCCESS;
            else
                return ApplicationProperties.RECORD_NOT_FOUND;

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
            return ApplicationProperties.DB_ERROR;

        } catch (InvalidEmployeeObjectException e) {

            return e.getMessage();
        }
    }


    public String updateEmployee(Employee employee) {

        try {

            int n = service.updateEmployee(employee);

            if (n == 1)
                return ApplicationProperties.UPDATE_SUCCESS;
            else
                return ApplicationProperties.RECORD_NOT_FOUND;

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
            return ApplicationProperties.DB_ERROR;

        } catch (InvalidEmployeeObjectException e) {

            return e.getMessage();
        }
    }


    public String deleteEmployee(int eid) {

        try {

            int n = service.deleteEmployee(eid);

            if (n == 1)
                return ApplicationProperties.DELETE_SUCCESS;
            else
                return ApplicationProperties.RECORD_NOT_FOUND;

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
            return ApplicationProperties.DB_ERROR;

        } catch (InvalidEmployeeObjectException e) {

            return e.getMessage();
        }
    }


    public String findEmployee(int eid) {

        try {

            Employee employee = service.findEmployee(eid);

            if (employee != null)
                return employee.toString();
            else
                return ApplicationProperties.RECORD_NOT_FOUND;

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
            return ApplicationProperties.DB_ERROR;

        } catch (InvalidEmployeeObjectException e) {

            return e.getMessage();
        }
    }


    public String findAllEmployee() {

        try {

            return service.findAllEmployee().toString();

        } catch (ClassNotFoundException | SQLException e) {

            e.printStackTrace();
            return ApplicationProperties.DB_ERROR;
        }
    }
}