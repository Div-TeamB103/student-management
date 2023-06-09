package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.info.Statics;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    @PostMapping()
    public  String create (@RequestBody Student student ){
        Statics.studentList.add(student);
        return "created";
    }
     @GetMapping("/student/{id}")
    public Student  getStudentWithId(@PathVariable(name = "id") int id ){
         return Statics.studentList.stream()
                 .filter(student -> student.getId()==id)
                 .findFirst()
                 .orElse(null);
 }

    @GetMapping()
    public List<Student> getAllStudents(){

         return Statics.studentList;

    }

  @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") int id ){
        Statics.studentList.removeIf(s->s.getId()==id);}


    @PutMapping()
    public  void update(@RequestBody Student student ){
        Student student3 =Statics.studentList.stream()
                        .filter(student1 -> student1.getId()==student.getId())
                                .findFirst().get();
        Statics.studentList.remove(student3);
        Statics.studentList.add(student);

    }


}
