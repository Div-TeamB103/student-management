package com.div.schoolmanagement.inter;

import com.div.schoolmanagement.entity.Subject;

import java.util.List;

public interface SubjectServiceInter {
    void createSubject(Subject subject);
    List<Subject>readAllSubject();
    void updateSubjectGetById(int id,Subject subject);
    void deleteSubjectById(int id);
    Subject subjectGetById(int id);

}
