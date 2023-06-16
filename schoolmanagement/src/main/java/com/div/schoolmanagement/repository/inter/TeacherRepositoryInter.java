package com.div.schoolmanagement.repository.inter;

import com.div.schoolmanagement.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherRepositoryInter {
    Optional<Teacher> getTeacherWithId(int id);
    List<Teacher> getAllTeachers();
    void createTeacher(Teacher teacher);
    Teacher updateTeacher(int id, Teacher teacher);
    void deleteTeacher(int id);
}
