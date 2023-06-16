package com.div.schoolmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private Integer id;
    private String name;
    private String surname;
    private int age;
    private int salary;
    private List<Group> groups;
    private List<Subject> subjects;
    private List<Student> students;

}
