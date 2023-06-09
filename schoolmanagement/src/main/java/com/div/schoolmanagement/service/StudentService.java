package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.repository.StudentRepository;
import com.div.schoolmanagement.service.inter.StudentServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentServiceInter {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Optional<Student> getStudentWithId(int id) {
        return studentRepository.getStudentWithId(id);
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public void createStudent(Student student) {
        studentRepository.createStudent(student);
    }

    public void deleteStudent(int id) {
        studentRepository.deleteStudent(id);
    }

    public void updateStudent(int id, Student student) {
        studentRepository.updateStudent(id, student);
    }

}

