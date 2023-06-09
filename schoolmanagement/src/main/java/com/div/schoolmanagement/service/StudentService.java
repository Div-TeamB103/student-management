package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.StudentServiceInter;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
public class StudentService implements StudentServiceInter {
    @PostMapping
    public void create(@RequestBody Student student) {
        Statics.studentList.add(student);
    }
    @GetMapping
    public List<Student> readAll() {
        return Statics.studentList;
    }
    @PutMapping
    public void updateById(@RequestBody Student student, @PathVariable int id) {
        Student student2 = Statics.studentList.stream()
                .filter(student1 -> student1.getId() == id).findFirst().orElse(null);
        if (student2==null) {
            student2.setName(student2.getName());
            student2.setSurname(student2.getSurname());
            student2.setAge(student2.getAge());
            student2.setId(student2.getId());
        }

    }
    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable int id) {
        Statics.studentList.removeIf(student -> student.getId() == id);
    }

    @GetMapping("{id}")
    public Student searchById(@PathVariable int id) {
        return Statics.studentList.stream()
                .filter(student -> student.getId() == id).findFirst().orElse(null);
    }


}
