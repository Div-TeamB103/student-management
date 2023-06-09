package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Grade;

import java.util.ArrayList;
import java.util.List;

public interface GradeServiceInter {
    void create(Grade grade);

    Grade getGradeById(int id);

     List<Grade> getAll(Grade grade);

     void delete(int id);


    void updateById(int id, Grade grade);
}
