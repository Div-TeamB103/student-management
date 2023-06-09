package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Grade;
import com.div.schoolmanagement.info.Statics;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("grades")
public class GradeController {

    @PostMapping()
    public String creatGrade(@RequestBody Grade grade){
        Statics.gradeList.add(grade);
        return "Created";

    }
    @GetMapping("{id}")
    public Grade getGradeById(@PathVariable int id ){
        return Statics.gradeList.stream()
                .filter(grade -> grade.getId()==id)
                .findFirst()
                .orElse(null);
    }
    @GetMapping()
    public List<Grade> getAllGrade(){
        return Statics.gradeList;

    }
}
