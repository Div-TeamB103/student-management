package com.div.schoolmanagement.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

//    private StudentService studentService;
//
//    @Autowired
//    public StudentController(StudentService studentService) {
//        this.studentService = studentService;
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Student> getStudentWithId(@PathVariable(name = "id") String id) {
//        return studentService.getStudentWithId(id);
//    }
//
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return studentService.getAllStudents();
//    }
//
//    @PostMapping
//    public void createStudent(@RequestBody Student student) {
//        studentService.createStudent(student);
//    }
//
//    @PutMapping("/{id}")
//    public void updateStudent(@PathVariable String id, @RequestBody Student student) {
//        studentService.updateStudent(id, student);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable String id) {
//        studentService.deleteStudent(id);
//    }

}
