package com.div.schoolmanagement.repository.inter;

import com.div.schoolmanagement.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepositoryInter {

    List<Student> getAllStudents();
    Optional<Student> getStudentWithId(int id);
    void createStudent(Student student);
    void updateStudent(int id, Student student);
    void deleteStudent(int id);
}
