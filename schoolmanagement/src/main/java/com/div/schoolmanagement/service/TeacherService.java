package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.repository.TeacherRepository;
import com.div.schoolmanagement.service.inter.TeacherServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService implements TeacherServiceInter {
    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Optional<Teacher> getTeacherWithId(int id) {
        return teacherRepository.getTeacherWithId(id);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }

    public void createTeacher(Teacher teacher) {
        teacherRepository.createTeacher(teacher);
    }

    public void updateTeacher(int id, Teacher teacher) {
        teacherRepository.updateTeacher(id, teacher);
    }

    public void deleteTeacher(int id) {
        teacherRepository.deleteTeacher(id);
    }

}
