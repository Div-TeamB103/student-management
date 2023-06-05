package com.div.schoolmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer id;
    private String name;
    private String surname;
    private Integer age;
    private Integer salary;

    private List<Group> groups;
    private List<Subject> subjects;


    public Teacher(Integer id, String name, String surname, Integer age, Integer salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }
}
