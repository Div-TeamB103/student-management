package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.info.Statics;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TeacherRepository {
    private static final List<Teacher> teacherList = Statics.teacherList;
    public Optional<Teacher> getTeacherWithId(int id) {
        return teacherList.stream().filter(teacher -> teacher.getId() == id).findAny();
    }

    public List<Teacher> getAllTeachers() {
        return teacherList;
    }

    public void createTeacher(Student student) {

    }

    public void updateTeacher(int id, Teacher teacher) {

    }

    public void deleteTeacher(int id) {

    }
}
