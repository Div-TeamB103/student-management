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
        Teacher existTeacherFromData = getTeacherById(teacherId);
        if (existTeacherFromData != null) {
            if (newTeacher.getName() == null)
                newTeacher.setName(existTeacherFromData.getName());
            if (newTeacher.getSurname() == null)
                newTeacher.setSurname(existTeacherFromData.getSurname());
            if (newTeacher.getAge() == null)
                newTeacher.setAge(existTeacherFromData.getAge());
            if (newTeacher.getSalary() == null)
                newTeacher.setSalary(existTeacherFromData.getSalary());
            //TODO
            if (newTeacher.getGroups() == null || newTeacher.getGroups().isEmpty())
                newTeacher.setGroups(newTeacher.getGroups());
            if (newTeacher.getStudents() == null || newTeacher.getStudents().isEmpty())
                newTeacher.setStudents(newTeacher.getStudents());
            if (newTeacher.getSubjects() == null || newTeacher.getSubjects().isEmpty())
                newTeacher.setSubjects(new);

        }

        if (!isEmpty(newTeacher)) {
            teacherRepository.updateTeacher(teacherId, newTeacher);
        }
    }

    private boolean isEmpty(Teacher newTeacher) {
        return newTeacher.getName() == null &&
                newTeacher.getSurname() == null &&
                newTeacher.getAge() == null &&
                newTeacher.getSalary() == null &&
                newTeacher.getGroups() == null &&
                newTeacher.getSubjects() == null &&
                newTeacher.getStudents() == null;
    }

    public void deleteTeacher(Integer teacherId) {
        teacherRepository.deleteTeacher(teacherId);
    }

}
