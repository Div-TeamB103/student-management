package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.TeacherServiceInter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TeacherService implements TeacherServiceInter {

    @Override
    public String create(Teacher teacher) {
        Statics.teacherList.add(teacher);
        return  "Created";
    }

    @Override
    public Teacher getById(Teacher teacher, int id) {
        return Statics.teacherList.stream()
                .filter(teacher1 -> teacher1.getId()==id)
                .findFirst()
                .orElse(null);
    }
    @Component
    @Override
    public List<Teacher> getAll() {
        return Statics.teacherList;
    }

    @Override
    public void deleted(Teacher teacher,int id) {
        Statics.teacherList.removeIf(teacher1 -> teacher1.getId()==id);
    }

    @Override
    public Teacher update(Teacher teacher, int id) {
        Teacher oldteacher=Statics.teacherList.stream()
                .filter(teacher1 -> teacher1.getId()==id)
                .findFirst().orElse(null);
        if (oldteacher!=null){
            oldteacher.setName(teacher.getName());
            oldteacher.setSurname(teacher.getSurname());
            oldteacher.setAge(teacher.getAge());
            oldteacher.setSalary(teacher.getSalary());
            oldteacher.setGroups(teacher.getGroups());
            oldteacher.setSubjects(teacher.getSubjects());
        }
        Statics.teacherList.set(id, oldteacher);
        return oldteacher;
    }

}
