package com.div.schoolmanagement.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
public class Student {

    public static int count = 0;

    private String name;
    private String surname;

    private int age;
    private int id;
    private String className;

    public Student(String name, String surname, int age, int id, String className) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = count;
        this.className = className;
        count++;
    }

}
