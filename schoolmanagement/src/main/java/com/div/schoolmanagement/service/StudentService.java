package com.div.schoolmanagement.service;

import com.div.schoolmanagement.dao.StudentDao;
import com.div.schoolmanagement.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentDao studentDao;

    @Autowired
    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(Integer studentId) {
        return studentDao.getStudentById(studentId);
    }

    public void createStudent(Student student) {
        studentDao.createStudent(student);
    }

    public void updateStudent(Integer studentId, Student student) {
        student.setId(studentId);
        studentDao.updateStudent(student);
    }

    public void deleteStudent(Integer studentId) {
        studentDao.deleteStudent(studentId);
    }

}
