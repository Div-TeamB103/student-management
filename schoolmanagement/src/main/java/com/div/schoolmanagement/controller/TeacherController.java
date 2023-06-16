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

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherService.getAllTeachers();
    }

    @GetMapping("/{id}")
    public Teacher getTeacherWithId(@PathVariable("id") Integer teacherId) {
        return teacherService.getTeacherById(teacherId);
    }

    @PostMapping
    public void createTeacher(@RequestBody Teacher teacher) {
        teacherService.createTeacher(teacher);
    }

    @PutMapping("/{id}")
    public void updateTeacher(@PathVariable("id") Integer teacherId, @RequestBody Teacher newTeacher) {
        teacherService.updateTeacher(teacherId, newTeacher);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable("id") Integer teacherId) {
        teacherService.deleteTeacher(teacherId);
    }

}
