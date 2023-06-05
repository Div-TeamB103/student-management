package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Student;
import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    private TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teacher/{id}")
    public Optional<Teacher> getTeacherWithId(ModelMap modelMap, @PathVariable int id) {
        return teacherService.getTeacherWithId(id);
    }

    @GetMapping()
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @PostMapping("/create/")
    public void createTeacher(@RequestBody Teacher teacher) {
        teacherService.createTeacher(teacher);
    }

    @PutMapping("/update/{id}")
    public void updateTeacher(@PathVariable int id, @RequestBody Teacher teacher) {
        teacherService.updateTeacher(id, teacher);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        teacherService.deleteTeacher(id);
    }

}
