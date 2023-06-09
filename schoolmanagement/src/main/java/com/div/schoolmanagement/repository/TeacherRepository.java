package com.div.schoolmanagement.repository;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.repository.inter.TeacherRepositoryInter;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TeacherRepository implements TeacherRepositoryInter {
    private static final List<Teacher> teacherList = Statics.teacherList;
    public Optional<Teacher> getTeacherWithId(int id) {
        return teacherList.stream().filter(teacher -> teacher.getId() == id).findAny();
    }

    public List<Teacher> getAllTeachers() {
        return teacherList;
    }

    public void createTeacher(Teacher teacher) {
        long count = teacherList.stream().filter(teacherById -> teacherById.getId() == teacher.getId()).count();
        if (count == 0) {
            teacherList.add(teacher);
        }
    }

    public void updateTeacher(int id, Teacher teacher) {
        teacherList.stream().filter(teacherFromList -> teacherFromList.getId() == teacher.getId())
                .forEach(teacherFromList -> teacherList.set(teacherList.indexOf(teacherFromList), teacher));
    }

    public void deleteTeacher(int id) {
        teacherList.removeIf(teacherById -> teacherById.getId() == id);
    }
}
