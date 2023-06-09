package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Subject;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.SubjectServiceInter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements SubjectServiceInter {


    @Override
    public void create(Subject subject) {
        Statics.subjectList.add(subject);
    }

    @Override
    public void delete(int id) {
        Statics.subjectList.removeIf(subject -> subject.getId() == id);
    }

    @Override
    public Subject searchById(int id) {
        return Statics.subjectList.stream().filter(subject -> subject.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Subject> readAll(Subject subject) {
        return   Statics.subjectList;
    }

    @Override
    public void updateById(int id, Subject subject) {
        Subject oldSubject = Statics.subjectList.stream().filter(subject1 -> subject1.getId() == id).findFirst().orElse(null);
        if (oldSubject != null) {
            oldSubject.setSubjectName(subject.getSubjectName());
            oldSubject.setId(subject.getId());
        }
    }

}
