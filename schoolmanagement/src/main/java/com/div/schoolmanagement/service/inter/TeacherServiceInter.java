package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Teacher;

import java.util.List;

public interface TeacherServiceInter {
     void create(Teacher teacher);
     void updateById(int id,Teacher teacher);
      Teacher searchById(int id);
      void delete(int id);
      List<Teacher> readAll();

}
