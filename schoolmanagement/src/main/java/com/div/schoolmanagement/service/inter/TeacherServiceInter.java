package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Teacher;

import java.util.List;

public interface TeacherServiceInter {

    List<Teacher> getAllTeachers();

    Teacher getTeacherById(Integer id);

    void createTeacher(Teacher teacher);

    void updateTeacher(Integer id, Teacher teacher);

    void deleteTeacher(Integer id);
}
