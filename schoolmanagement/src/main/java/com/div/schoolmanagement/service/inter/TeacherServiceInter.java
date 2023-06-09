package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherServiceInter {

    Optional<Teacher> getTeacherWithId(int id);

    List<Teacher> getAllTeachers();

    void createTeacher(Teacher teacher);

    void updateTeacher(int id, Teacher teacher);

    void deleteTeacher(int id);
}
