package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Subject;
import com.div.schoolmanagement.inter.SubjectServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("subjects")
@RequiredArgsConstructor
public class SubjectController {

    private final SubjectServiceInter subjectServiceInter;
    @PostMapping
    public void createSubject(Subject subject){
        subjectServiceInter.createSubject(subject);
    }
    @GetMapping
    public List<Subject>readAllSubject(){
        return subjectServiceInter.readAllSubject();
    }
    @PutMapping("/{id}")
    public void updateSubjectById(Subject subject,int id){
        subjectServiceInter.updateSubjectGetById(subject,id);
    }
    @DeleteMapping("/{id}")
    public void deleteSubjectById(int id){
        subjectServiceInter.deleteSubjectById(id);
    }
    @GetMapping("/{id}")
    public Subject subjectGetById(int id){
        return subjectServiceInter.subjectGetById(id);
    }

}
