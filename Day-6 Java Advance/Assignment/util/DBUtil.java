package com.coforge.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static Connection getDBConnection()
            throws ClassNotFoundException, SQLException {

        Class.forName(ApplicationProperties.DRIVER);

        Connection connection = DriverManager.getConnection(
                ApplicationProperties.URL,
                ApplicationProperties.USERNAME,
                ApplicationProperties.PASSWORD);

        System.out.println(connection.getCatalog());

        return connection;
    }
}