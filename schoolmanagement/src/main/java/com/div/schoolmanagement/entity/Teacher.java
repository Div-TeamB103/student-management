package com.div.schoolmanagement.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;


@Getter
@Setter
public class Teacher {
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
        this.id = id;
        this.salary = salary;
        this.groups = groups;
        this.subjects = subjects;
    }

    public Teacher(String name, String surname, int age, int id, int salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                ", groups=" + groups +
                ", subjects=" + subjects +
                '}';
    }
}
