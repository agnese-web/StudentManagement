package com.company.dbHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {


    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/students", "root", "Mikus2909");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
