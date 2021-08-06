package com.company.objects;

public class Student {

    // declare the features of a student
    private int id;
    private String name;
    private int age;

    public Student() {

    }

    //  define getters, setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
