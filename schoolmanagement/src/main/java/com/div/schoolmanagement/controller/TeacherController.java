package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.TeacherServiceInter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("teacher")
@RestController

public class TeacherController {
    private TeacherServiceInter teacherServiceInter;

    @PostMapping
    public void create(@RequestBody Teacher teacher) {
        teacherServiceInter.create(teacher);
    }


    @PutMapping
    public void updateById(@PathVariable int id, Teacher teacher) {
        teacherServiceInter.updateById(id, teacher);
    }

    @GetMapping("{id}")
    public Teacher searchById(@PathVariable int id) {
        return teacherServiceInter.searchById(id);
    }

    @DeleteMapping("{id}")
    public void deleteTeacher(@PathVariable int id) {
        teacherServiceInter.delete(id);
    }

    @GetMapping
    public List<Teacher> readAll() {
        return teacherServiceInter.readAll();
    }
}






