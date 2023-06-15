package com.div.schoolmanagement.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Teacher {
    private int id ;
    private String name ;
    private String surname ;
    private int age ;
    private int salary;

    private List<Student> students;
    private List<Group> groups;
    private List<Subject> subjects;



}
