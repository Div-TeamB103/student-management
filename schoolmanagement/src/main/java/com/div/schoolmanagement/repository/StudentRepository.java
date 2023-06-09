package com.div.schoolmanagement.repository;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.repository.inter.StudentRepositoryInter;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentRepository implements StudentRepositoryInter {

    private final List<Student> studentList = Statics.studentList;

    public List<Student> getAllStudents() {
        return studentList;
    }

    public Optional<Student> getStudentWithId(int id) {
        return studentList.stream().filter(studentById -> studentById.getId() == id).findAny();
    }

    public void createStudent(Student student) {
        long count = studentList.stream().filter(studentById -> studentById.getId() == student.getId()).count();
        if (count == 0) {
            studentList.add(student);
        }
    }

    public void updateStudent(int id, Student student) {
        studentList.stream().filter(studentFromList -> studentFromList.getId() == student.getId())
                .forEach(studentFromList -> studentList.set(studentList.indexOf(studentFromList), student));
    }

    public void deleteStudent(int id) {
        studentList.removeIf(studentById -> studentById.getId() == id);
    }
}
