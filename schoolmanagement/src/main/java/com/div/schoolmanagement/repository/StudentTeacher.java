package com.div.schoolmanagement.repository;

import com.div.schoolmanagement.repository.inter.StudentTeacherInter;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentTeacher implements StudentTeacherInter {

    @Override
    public List<StudentTeacher> getAllStudentTeacher() {

        return null;
    }

    @Override
    public Optional<StudentTeacher> getStudTeachRelationByIds(Integer studentId, Integer teacherId) {
        return Optional.empty();
    }

    @Override
    public void updateStudentTeacherRelationship(Integer studentId, Integer teacherId) {

    }

    @Override
    public void createStudentTeacherRelationship(Integer studentId, Integer teacherId) {

    }

    @Override
    public void deleteStudentTeacherRelationship(Integer studentId, Integer teacherId) {

    }
}
