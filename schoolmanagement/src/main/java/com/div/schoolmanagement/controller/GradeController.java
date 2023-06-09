package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Grade;
import com.div.schoolmanagement.entity.Group;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.GradeService;
import com.div.schoolmanagement.service.serviceInter.GradeServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.div.schoolmanagement.info.Statics.gradeList;

@RestController
@RequestMapping("/grades")
public class GradeController {
    @Autowired
    private GradeServiceInter gradeServiceInter;


    @GetMapping
    public List<Grade> getAll() {
        return gradeServiceInter.getAll();

    }

    @GetMapping("/{id}")
    public Grade getGradeById(@PathVariable int id) {
     return  gradeServiceInter.getGradeById(id);

    }

    @PostMapping
    public void create(@RequestBody Grade grade) {
        gradeServiceInter.create(grade);
    }



    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Grade grade) {
        gradeServiceInter.update(id,grade);

    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        gradeServiceInter.delete(id);
    }


}
