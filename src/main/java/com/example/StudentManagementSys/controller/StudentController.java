package com.example.StudentManagementSys.controller;

import com.example.StudentManagementSys.entities.Student;
import com.example.StudentManagementSys.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class StudentController {
    private StudentRepository studentRepository = new StudentRepository(new ArrayList<Student>() {{
        add(new Student("小一", "男", "1-1"));
        add(new Student("小二", "男", "1-2"));
        add(new Student("小四", "男", "1-4"));
        add(new Student("小五", "女", "1-5"));
        add(new Student("小六", "女", "1-6"));
    }});

    @PostMapping("/addStudentsByName")
    public String addStudentsByName(@RequestBody Student student) {
        if (studentRepository.addStudent(student)) {
            return "添加成功";
        } else {
            return "姓名重复";
        }
    }

    @GetMapping("/getAllStudents")
    public String getAllStudents() {
        return studentRepository.toString();
    }

    @PostMapping("/getStudentsByName")
    public String getStudentsByName(@RequestBody String name) {
        Student student = studentRepository.getStudentByName(name);
        if (null == student.getName()) {
            return "该学生不存在";
        } else {
            return student.toString();
        }
    }

    @PostMapping("/deleteStudentsByName")
    public String deleteStudentsByName(@RequestBody String name) {
        if (studentRepository.deleteStudentByName(name)) {
            return "删除成功";
        } else {
            return "该学生不存在";
        }
    }


}
