package com.coforge.ems.util;

public class ApplicationProperties {

    // Database Details
    public static final String DRIVER =
            "com.mysql.cj.jdbc.Driver";

    public static final String URL =
            "jdbc:mysql://localhost:3306/mydatabase";

    public static final String USERNAME =
            "root";

    public static final String PASSWORD =
            "root";

    // SQL Queries
    public static final String insertSql =
            "INSERT INTO employee1 VALUES(?,?,?,?)";

    public static final String updateSql =
            "UPDATE employee1 SET ename=?, esalary=?, dno=? WHERE eid=?";

    public static final String deleteSql =
            "DELETE FROM employee1 WHERE eid=?";

    public static final String findSql =
            "SELECT * FROM employee1 WHERE eid=?";

    public static final String findAllSql =
            "SELECT * FROM employee1";

    // Application Messages
    public static final String INSERT_SUCCESS =
            "SUCCESS : Employee Inserted Successfully";

    public static final String UPDATE_SUCCESS =
            "SUCCESS : Employee Updated Successfully";

    public static final String DELETE_SUCCESS =
            "SUCCESS : Employee Deleted Successfully";

    public static final String RECORD_NOT_FOUND =
            "FAILED : Employee Not Found";

    public static final String DB_ERROR =
            "FAILED : Database Error";

    public static final String VALIDATION_FAILED =
            "FAILED : Invalid Employee Details";
}