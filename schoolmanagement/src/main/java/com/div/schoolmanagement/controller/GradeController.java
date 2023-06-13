package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Grade;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.GradeService;
import com.div.schoolmanagement.service.inter.GradeServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/grades")

public class GradeController {

    @Autowired
    private GradeServiceInter gradeServiceInter;


    private List<Grade> gradeList = Statics.gradeList;

    @GetMapping("/all")
    public List<Grade> getAll(@RequestBody Grade grade) {
        return gradeServiceInter.getAll(grade);
    }

    @GetMapping("/{id}")
    public Grade getGradeById(@PathVariable int id) {
       return gradeServiceInter.getGradeById(id);
    }

    @PostMapping
    public void create(@RequestBody Grade grade) {
         gradeServiceInter.create(grade);
    }

    @PutMapping
    public void update(@PathVariable int id, @RequestBody Grade grade) {
        gradeServiceInter.updateById(id, grade);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        gradeServiceInter.delete(id);
    }
}
