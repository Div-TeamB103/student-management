package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.TeacherServiceInter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/teachers")
public class TeacherController {

    @Autowired
    private TeacherServiceInter teacherService;

    @PostMapping()
    public String create(@RequestBody Teacher teacher) {
       return teacherService.create(teacher);
    }

    @GetMapping(path = "/{id}")
    public Teacher getTeacher(@PathVariable(value = "id") int id, Teacher teacher) {
        return teacherService.getById(teacher, id);
    }

    @GetMapping()
    public List<Teacher> getAll() {
        return teacherService.getAll();
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleted(@PathVariable(value = "id") Teacher teacher,int id) {
        teacherService.deleted(teacher,id);
    }

    @PutMapping(path = "/{id}")
    public Teacher update(@PathVariable(value = "id") int id, Teacher teacher) {
        return update(id,   teacher);
    }

}
