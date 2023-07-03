package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.repository.TeacherRepository;
import com.div.schoolmanagement.service.inter.TeacherServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TeacherService implements TeacherServiceInter {
    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher getTeacherById(String sId) {
        Integer teacherId = checkIdForValid(sId);
        return teacherRepository.getTeacherById(teacherId).orElse(null);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }

    public void createTeacher(Teacher newTeacher) {
        if (isNotEmpty(newTeacher)) {
            teacherRepository.createTeacher(newTeacher);
        }
    }


    public void updateTeacher(String sId, Teacher newTeacher) {
        Integer teacherId = checkIdForValid(sId);



    }

    //TODO
    @Override
    public void deleteTeacher(String sId) {

    }

    private boolean isNotEmpty(Teacher newTeacher) {
        return newTeacher.getName() != null &&
                newTeacher.getSurname() != null &&
                newTeacher.getAge() != null &&
                newTeacher.getSalary() != null &&
                newTeacher.getGroups() != null &&
                newTeacher.getSubjects() != null &&
                newTeacher.getStudents() != null;
    }

    private Integer checkIdForValid(String sId) {
        try {
            int id = Integer.parseInt(sId);
            if (id <= 0) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Id can not be minus: " + sId);
            }
            return id;
        } catch (NumberFormatException nEx) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Given id is invalid: " + sId);
        }

    }

}
