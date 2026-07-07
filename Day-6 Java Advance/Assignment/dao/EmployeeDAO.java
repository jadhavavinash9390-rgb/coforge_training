package com.coforge.ems.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.coforge.ems.model.Employee;
import com.coforge.ems.util.ApplicationProperties;
import com.coforge.ems.util.DBUtil;

public class EmployeeDAO {

   
    // CREATE (INSERT)

    public int createEmployee(Employee employee)
            throws ClassNotFoundException, SQLException {

        Connection connection = DBUtil.getDBConnection();

        PreparedStatement statement =
                connection.prepareStatement(ApplicationProperties.insertSql);

        statement.setInt(1, employee.getEid());
        statement.setString(2, employee.getEname());
        statement.setInt(3, employee.getEsalary());
        statement.setInt(4, employee.getDno());

        int n = statement.executeUpdate();

        connection.close();

        return n;
    }


    // UPDATE

    public int updateEmployee(Employee employee)
            throws ClassNotFoundException, SQLException {

        Connection connection = DBUtil.getDBConnection();

        PreparedStatement statement =
                connection.prepareStatement(ApplicationProperties.updateSql);

        statement.setString(1, employee.getEname());
        statement.setInt(2, employee.getEsalary());
        statement.setInt(3, employee.getDno());
        statement.setInt(4, employee.getEid());

        int n = statement.executeUpdate();

        connection.close();

        return n;
    }

  
    // DELETE
 
    public int deleteEmployee(int eid)
            throws ClassNotFoundException, SQLException {

        Connection connection = DBUtil.getDBConnection();

        PreparedStatement statement =
                connection.prepareStatement(ApplicationProperties.deleteSql);

        statement.setInt(1, eid);

        int n = statement.executeUpdate();

        connection.close();

        return n;
    }


    // FIND BY ID
   
    public Employee findEmployee(int eid)
            throws ClassNotFoundException, SQLException {

        Employee employee = null;

        Connection connection = DBUtil.getDBConnection();

        PreparedStatement statement =
                connection.prepareStatement(ApplicationProperties.findSql);

        statement.setInt(1, eid);

        ResultSet rs = statement.executeQuery();

        if (rs.next()) {

            employee = new Employee();

            employee.setEid(rs.getInt("eid"));
            employee.setEname(rs.getString("ename"));
            employee.setEsalary(rs.getInt("esalary"));
            employee.setDno(rs.getInt("dno"));
        }

        connection.close();

        return employee;
    }

  
    // FIND ALL
   
    public List<Employee> findAllEmployee()
            throws ClassNotFoundException, SQLException {

        List<Employee> employeeList = new ArrayList<>();

        Connection connection = DBUtil.getDBConnection();

        PreparedStatement statement =
                connection.prepareStatement(ApplicationProperties.findAllSql);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {

            Employee employee = new Employee();

            employee.setEid(rs.getInt("eid"));
            employee.setEname(rs.getString("ename"));
            employee.setEsalary(rs.getInt("esalary"));
            employee.setDno(rs.getInt("dno"));

            employeeList.add(employee);
        }

        connection.close();

        return employeeList;
    }

}