package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Teacher;

import java.util.List;

public interface TeacherServiceInter {

    List<Teacher> getAllTeachers();

    Teacher getTeacherById(String id);

    void createTeacher(Teacher teacher);

    void updateTeacher(String id, Teacher teacher);

    void deleteTeacher(String id);
}
