package com.div.schoolmanagement.repository.inter;

import com.div.schoolmanagement.repository.StudentTeacher;

import java.util.List;
import java.util.Optional;

public interface StudentTeacherInter {

    List<StudentTeacher> getAllStudentTeacher();

    Optional<StudentTeacher> getStudTeachRelationByIds(Integer studentId, Integer teacherId);

    void updateStudentTeacherRelationship(Integer studentId, Integer teacherId);

    void createStudentTeacherRelationship(Integer studentId, Integer teacherId);

    void deleteStudentTeacherRelationship(Integer studentId, Integer teacherId);
}
