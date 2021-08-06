package com.company.controller;

import com.company.dbHelper.DbConnection;
import com.company.objects.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentController {
    private static Scanner scanner = new Scanner(System.in);
    private static PreparedStatement ps;
    private static ResultSet rs;



    public static boolean addNewStudent() {
        // prompt the user for data
        System.out.print("Enter the name of the student: ");
        String name = scanner.next();

        System.out.print("Enter the age of the student: ");
        int age = scanner.nextInt();



        try {
            ps = DbConnection.getConnection().prepareStatement("INSERT INTO students(name, age) " +
                    "VALUES('" + name + "'," + age + ")");

            ps.execute();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static Student getStudentById() {

        // Prompt the user to enter the if of the student they want to retrieve
        System.out.print("Enter the id of the student: ");
        int id = scanner.nextInt();

        try {
            ps = DbConnection.getConnection().prepareStatement("SELECT * FROM students WHERE id=" + id);
            rs = ps.executeQuery();

            int studentId, age;
            String name;

            Student student = new Student();
            while (rs.next()) {
                studentId = rs.getInt("id");
                name = rs.getString("name");
                age = rs.getInt("age");
                student.setId(studentId);
                student.setName(name);
                student.setAge(age);
            }

            return student;


            // return new Student(rs......   īsāks pieraksts

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }


    }
}
