package com.div.schoolmanagement.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class Teacher {
    public static int count = 1;
    private String name ;
    private String surname ;

    private int age ;
    private int id ;
    private int salary;

    private List<Group> groups;

    private List<Subject> subjects;

    public Teacher(String name, String surname, int age, int id, int salary, List<Group> groups, List<Subject> subjects) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = count;
        this.salary = salary;
        this.groups = groups;
        this.subjects = subjects;
        count++;
    }
}
