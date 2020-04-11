package com.example.StudentManagementSys.repository;

import com.example.StudentManagementSys.entities.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentRepository {
    private List<Student> allStudents = new ArrayList<>();

    public StudentRepository() {
    }

    public StudentRepository(List<Student> allStudents) {
        this.allStudents = allStudents;
    }

    public List<Student> getAllStudents() {
        return allStudents;
    }

    @Override
    public String toString() {
        StringBuilder allStudentsString = new StringBuilder();
        for (Student allStudent : allStudents) {
            allStudentsString.append(allStudent).append("\n");
        }
        return allStudentsString.toString();
    }

    public boolean addStudent(Student student) {
        for (Student allStudent : allStudents) {
            if (allStudent.getName().equals(student.getName())) {
                return false;
            }
        }
        allStudents.add(student);
        return true;
    }

    public Student getStudentByName(String name) {
        for (Student student : allStudents) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return new Student();
    }

    public boolean deleteStudentByName(String name) {
        Student deleteStudent = new Student();
        for (Student student : allStudents) {
            if (student.getName().equals(name)) {
                deleteStudent = student;
                break;
            }
        }
        return allStudents.remove(deleteStudent);
    }
}
