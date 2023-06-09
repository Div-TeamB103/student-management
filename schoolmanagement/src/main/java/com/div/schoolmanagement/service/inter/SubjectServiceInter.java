package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Subject;

import java.util.List;

public interface SubjectServiceInter {
    void create(Subject subject);

    void delete(int id);

    Subject searchById(int id);
    List<Subject> readAll(Subject subject);
    void updateById(int id, Subject subject);
}
