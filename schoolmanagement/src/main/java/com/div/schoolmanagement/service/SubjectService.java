package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Subject;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.inter.SubjectServiceInter;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectService implements SubjectServiceInter {
    @Override
    public void createSubject(Subject subject) {
        Statics.subjectList.add(subject);
    }

    @Override
    public List<Subject> readAllSubject() {
        return Statics.subjectList;
    }

    @Override
    public void updateSubjectGetById(Subject subject, int id) {
    Subject oldSubject=Statics.subjectList.stream()
            .filter(subject1 -> subject1.getId()==id)
            .findFirst()
            .orElse(null);
    if (oldSubject!=null){
        oldSubject.setSubjectName(subject.getSubjectName());

    }
    }

    @Override
    public void deleteSubjectById(int id) {
    Statics.subjectList.removeIf(subject -> subject.getId()==id);
    }

    @Override
    public Subject subjectGetById(int id) {
        return Statics.subjectList.stream()
                .filter(subject -> subject.getId()==id)
                .findFirst()
                .orElse(null);
    }
}
