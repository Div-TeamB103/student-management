package com.div.schoolmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private Integer salary;
    private List<Group> groups;
    private List<Subject> subjects;
    private List<Student> students;

    public void setGroups(List<Group> groups) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.addAll(groups);
    }

    public void setSubjects(List<Subject> subjects) {
        if (this.subjects == null) {
            this.subjects = new ArrayList<>();
        }
        this.subjects.addAll(subjects);
    }

    public void setStudents(List<Student> students) {
        if (this.students == null) {
            this.students = new ArrayList<>();
        }
        this.students.addAll(students);
    }


}
