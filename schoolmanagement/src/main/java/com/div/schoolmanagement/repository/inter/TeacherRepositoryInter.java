package com.div.schoolmanagement.repository.inter;

import com.div.schoolmanagement.entity.Group;
import com.div.schoolmanagement.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherRepositoryInter {
    Optional<Teacher> getTeacherById(Integer teacherId);
    List<Teacher> getAllTeachers();
    void createTeacher(Teacher teacher);
    void updateTeacher(Integer teacherId, Teacher teacher);
    void deleteTeacher(Integer teacherId);

    void updateGroupsForTeacher(Integer teacherId, List<Group> groups);
}
