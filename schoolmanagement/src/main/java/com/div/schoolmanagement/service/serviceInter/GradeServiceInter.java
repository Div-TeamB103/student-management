package com.div.schoolmanagement.service.serviceInter;

import com.div.schoolmanagement.entity.Grade;

import java.util.List;

public interface GradeServiceInter {
    void create(Grade grade);

    void update(int id, Grade grade);

    Grade getGradeById(int id);


    void delete(int id);
    List<Grade> getAll();
  }
