package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.repository.TeacherRepository;
import com.div.schoolmanagement.service.inter.TeacherServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService implements TeacherServiceInter {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher getTeacherById(Integer teacherId) {
        return teacherRepository.getTeacherWithId(teacherId).orElse(null);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }

    public void createTeacher(Teacher teacher) {
        teacherRepository.createTeacher(teacher);
    }

    public void updateTeacher(Integer teacherId, Teacher newTeacher) {
        teacherRepository.updateTeacher(teacherId, newTeacher);
    }

    public void deleteTeacher(Integer teacherId) {
        teacherRepository.deleteTeacher(teacherId);
    }

}
