package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.repository.TeacherRepository;
import com.div.schoolmanagement.repository.inter.StudentTeacherInter;
import com.div.schoolmanagement.service.inter.TeacherServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TeacherService implements TeacherServiceInter {
    private final TeacherRepository teacherRepository;
    private final StudentTeacherInter studentTeacher;

    @Autowired
    public TeacherService(TeacherRepository teacherRepository, StudentTeacherInter studentTeacher) {
        this.teacherRepository = teacherRepository;
        this.studentTeacher = studentTeacher;
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
        teacherRepository.getTeacherById(teacherId).ifPresent(existTeacherFromData -> {
            if (newTeacher.getName() != null)
                existTeacherFromData.setName(newTeacher.getName());
            if (newTeacher.getSurname() != null)
                existTeacherFromData.setSurname(newTeacher.getSurname());
            if (newTeacher.getAge() != null)
                existTeacherFromData.setAge(newTeacher.getAge());
            if (newTeacher.getSalary() != null)
                existTeacherFromData.setSalary(newTeacher.getSalary());
            if (newTeacher.getGroups() != null && !newTeacher.getGroups().isEmpty()) {
                //TODO
                teacherRepository.updateGroupsForTeacher(teacherId, newTeacher.getGroups());
            }

            if (newTeacher.getStudents() != null && !newTeacher.getStudents().isEmpty()) {
                newTeacher.getStudents().forEach(student -> {
                    if (studentTeacher.getStudTeachRelationByIds(teacherId, student.getId()).isEmpty()) {
                        studentTeacher.createStudentTeacherRelationship(teacherId, student.getId());
                    }
                });
            }
            if (newTeacher.getSubjects() != null && !newTeacher.getSubjects().isEmpty()) {
                //TODO
                existTeacherFromData.setSubjects(newTeacher.getSubjects());
            }

            teacherRepository.updateTeacher(teacherId, existTeacherFromData);
        });


    }

    //TODO
    @Override
    public void deleteTeacher(String sId) {
        Integer teacherId = checkIdForValid(sId);
        if (teacherRepository.getTeacherFromStudents_Teachers(teacherId).isEmpty() &&
                teacherRepository.getTeacherFromGroups_Teachers(teacherId).isEmpty() &&
                teacherRepository.getTeacherFromSubjects_Teachers(teacherId).isEmpty())
            teacherRepository.deleteTeacher(teacherId);
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
