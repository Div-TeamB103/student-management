package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

     @GetMapping("/student/{id}")
    public Student  getStudentWithId(@PathVariable(name = "id") int id ){


     return null;
 }

    @GetMapping()
    public List<Student> getAllStudents(){

         return
    }






}
