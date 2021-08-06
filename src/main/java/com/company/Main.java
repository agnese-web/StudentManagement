package com.company;

import com.company.Login.Login;
import com.company.controller.StudentController;

public class Main {



    public static void main(String[] args) {

        // ternary operator

//        System.out.println(StudentController.addNewStudent() ? "Successfully added a new student " : "Failed to add new student");
//        System.out.println(5> 7 ? "it's true" : "it's false");

//        System.out.println("The student is " + StudentController.getStudentById().getName());

        System.out.println(Login.addNewUser() ? "Successfully added a new user" : "Failed to add new user");



    }

    // Assignment
    // Add a new table to your student database and call it users.
    // it should have the following fields: id(INT, AUTO_INCREMENT), username(VARCHAR(50)), password(VARCHAR(50)).
    // Create a package called Login and inside this create a class called Login and use that class to implement
    // a login and sign up based on the users table.

}
