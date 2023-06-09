package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Subject;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.SubjectServiceInter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class SubjectController {

    private SubjectServiceInter subjectServiceInter;

    @PostMapping
    public void create(@RequestBody Subject subject) {
        subjectServiceInter.create(subject);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        subjectServiceInter.delete(id);
    }

    @GetMapping("{id}")
    public Subject searchById(@PathVariable int id) {
        return subjectServiceInter.searchById(id);
    }

    @GetMapping
    public List<Subject> readAll(@RequestBody Subject subject) {
        return subjectServiceInter.readAll(subject);
    }

    @PutMapping
    public void updateById(@PathVariable int id, @RequestBody Subject subject) {
        subjectServiceInter.updateById(id, subject);

    }
}
