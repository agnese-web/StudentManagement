package com.company.Login;

import com.company.dbHelper.DbConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.SQLException;

public class Login {

    // Assignment
    // Add a new table to your student database and call it users.
    // it should have the following fields: id(INT, AUTO_INCREMENT), username(VARCHAR(50)), password(VARCHAR(50)).
    // Create a package called Login and inside this create a class called Login and use that class to implement
    // a login and sign up based on the users table.


    // fields
    private int id;
    private static String username, password;

    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;

//    // object
//    public Login() {
//
//    }



    // getters, setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    // add new user
    public static boolean addNewUser() {
        // prompt the user for data
        System.out.print("Enter username: ");
        String username = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();



        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO users(username, password) " +
                    "VALUES('" + username + "'," + password + ")");

            ps.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
