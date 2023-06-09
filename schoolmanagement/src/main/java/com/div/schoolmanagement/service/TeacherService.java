package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.TeacherServiceInter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService implements TeacherServiceInter {


    @Override
    public void create(Teacher teacher) {
        Statics.teacherList.add(teacher);
    }

    @Override
    public void updateById(int id,Teacher teacher) {
         Teacher oldTeacher=Statics.teacherList.stream()
                 .filter(teacher1 -> teacher1.getId()==id)
                 .findFirst()
                 .orElse(null);
         if (oldTeacher!=null){
             oldTeacher.setName(teacher.getName());
             oldTeacher.setSurname(teacher.getSurname());
             oldTeacher.setAge(teacher.getAge());
             oldTeacher.setId(teacher.getId());
         }
    }

    @Override
    public Teacher searchById(int id) {
        return Statics.teacherList.stream()
                .filter(teacher -> teacher.getId() == id)
                .findFirst().orElse(null);
    }

    @Override
    public void delete(int id) {
        Statics.teacherList.removeIf(teacher -> teacher.getId()==id);

    }

    @Override
    public List<Teacher> readAll() {
        return Statics.teacherList;
    }
}
