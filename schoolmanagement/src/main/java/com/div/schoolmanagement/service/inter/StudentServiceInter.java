package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Student;

import java.util.List;

public interface StudentServiceInter {
    void create(Student student);
    List<Student> readAll();
    void updateById(Student student, int id);
    void deleteStudent(int id);
    Student searchById(int id);


}
