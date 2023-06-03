package com.div.schoolmanagement.entity;

import com.div.schoolmanagement.entity.Person;
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



}
