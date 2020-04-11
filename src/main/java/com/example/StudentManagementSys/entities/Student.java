package com.example.StudentManagementSys.entities;

public class Student {
    private String name;
    private String gender;
    private String classNumber;

    public Student() {
    }

    public Student(String name, String gender, String classNumber) {
        this.name = name;
        this.gender = gender;
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", classNumber='" + classNumber + '\'' +
                '}';
    }
}
