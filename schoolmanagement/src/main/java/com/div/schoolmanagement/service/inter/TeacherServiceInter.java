package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Teacher;

import java.util.List;

public interface TeacherServiceInter {

   String create (Teacher teacher);
   Teacher getById(Teacher teacher,int id);
   List<Teacher> getAll();
   void deleted(Teacher teacher,int id);
   Teacher update(Teacher teacher,int id);
}
