package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Subject;
import com.div.schoolmanagement.inter.SubjectServiceInter;
import com.div.schoolmanagement.repository.SubjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SubjectService implements SubjectServiceInter {

    private final SubjectRepository repository;

    @Override
    public void createSubject(Subject subject) {
        repository.createSubject(subject);
    }

    @Override
    public List<Subject> readAllSubject() {
        return repository.readAllSubject();
    }

    @Override
    public void updateSubjectGetById( int id,Subject subject) {
        repository.updateSubjectGetById(id,subject);

    }

    @Override
    public void deleteSubjectById(int id) {
    repository.deleteSubjectById(id);
    }

    @Override
    public Subject subjectGetById(int id) {
        return repository.subjectGetById(id);
    }
}
