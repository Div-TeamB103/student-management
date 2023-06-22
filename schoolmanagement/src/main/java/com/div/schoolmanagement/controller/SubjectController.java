package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Subject;
import com.div.schoolmanagement.inter.SubjectServiceInter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("subjects")
@RequiredArgsConstructor
public class SubjectController {

    private final SubjectServiceInter subjectServiceInter;

    @PostMapping
    public void createSubject(@RequestBody Subject subject) {
        subjectServiceInter.createSubject(subject);
    }

    @GetMapping
    public List<Subject> readAllSubject() {
        return subjectServiceInter.readAllSubject();
    }

    @PutMapping("/{id}")
    public void updateSubjectById(@PathVariable int id, @RequestBody Subject subject) {
        subjectServiceInter.updateSubjectGetById(id, subject);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteSubjectById(@PathVariable int id) {
        subjectServiceInter.deleteSubjectById(id);
    }

    @GetMapping("/{id}")
    public Subject subjectGetById(@PathVariable int id) {
        return subjectServiceInter.subjectGetById(id);
    }

}
