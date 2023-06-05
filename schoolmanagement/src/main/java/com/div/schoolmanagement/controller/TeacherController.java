package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.div.schoolmanagement.info.Statics.studentList;
import static com.div.schoolmanagement.info.Statics.teacherList;

@RestController
@RequestMapping("/teachers")
public class TeacherController {


    @PostMapping
    public void addTeacher(@RequestBody Teacher requestTeacher) {
        teacherList.add(requestTeacher);
    }

    @GetMapping("{id}")
    public Teacher getTeacher(@PathVariable int id) {
        Teacher teacher = teacherList.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not founded by id" + id));
        return teacher;
    }

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherList;
    }

    @PatchMapping("{id}")
    public void updateTeacherWithId(@PathVariable int id, String name) {
        Teacher teacher = teacherList.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not founded by id" + id));
        teacher.setName(name);
    }

    @PutMapping("{id}")
    public void updateTeacher(@PathVariable int id, Teacher requestTeacher) {
        Teacher teacher = teacherList.stream()
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Student not founded by id" + id));

        if (requestTeacher.getName() != null) {
            teacher.setName(requestTeacher.getName());
        }
        if (requestTeacher.getAge() != null) {
            teacher.setAge(requestTeacher.getAge());
        }
        if (requestTeacher.getSurname() != null) {
            teacher.setSurname(requestTeacher.getSurname());
        }
        if (requestTeacher.getSalary() != null) {
            teacher.setSalary(requestTeacher.getSalary());
        }

    }


}
