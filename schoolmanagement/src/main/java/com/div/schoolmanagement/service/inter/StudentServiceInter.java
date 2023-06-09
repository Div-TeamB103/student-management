package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentServiceInter {
    Optional<Student> getStudentWithId(int id);

    List<Student> getAllStudents();

    void createStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(int id, Student student);

}
