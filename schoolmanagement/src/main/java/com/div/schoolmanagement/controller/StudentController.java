package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.StudentServiceInter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentServiceInter studentServiceInter;

    @PostMapping
    public void create(@RequestBody Student student) {

    }

    @GetMapping
    public List<Student> readAll() {
        return studentServiceInter.readAll();
    }

    @PutMapping
    public void updateById(@RequestBody Student student, @PathVariable int id) {
        studentServiceInter.updateById(student, id);
    }


    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable int id) {
        studentServiceInter.deleteStudent(id);
    }

    @GetMapping("{id}")
    public Student searchById(@PathVariable int id) {
       return studentServiceInter.searchById(id);
    }




}
