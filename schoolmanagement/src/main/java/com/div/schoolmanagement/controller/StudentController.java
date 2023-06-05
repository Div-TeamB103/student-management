package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Student;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static com.div.schoolmanagement.info.Statics.studentList;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping("{id}")
    public Student getStudentWithId(@PathVariable int id) {
        Student student = studentList.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not founded by id" + id));
        return student;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentList;
    }

    @PostMapping
    public void addStudent(@RequestBody Student requestsStudent) {
        studentList.add(requestsStudent);
    }

    @PatchMapping("{id}")
    public void updateStudentWithId(@PathVariable int id, String name) {
        Student student = studentList.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not founded by id" + id));
        student.setName(name);
    }

    @PutMapping("{id}")
    public void updateStudent(@PathVariable int id, Student studentRequest) {
        Student student = studentList.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not founded by id" + id));

        if (studentRequest.getName() != null) {
            student.setName(studentRequest.getName());
        }

        if (studentRequest.getAge() != null) {
            student.setAge(studentRequest.getAge());
        }
        if (studentRequest.getSurname() != null) {
            student.setSurname(studentRequest.getSurname());
        }
        if (studentRequest.getClassName() != null) {
            student.setClassName(studentRequest.getClassName());
        }

    }

}
