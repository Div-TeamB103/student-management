package com.div.schoolmanagement.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student   {

    private int id ;
    private String name ;
    private String surname ;
    private int age ;
    private String className;
    List<Teacher> teachers;
}
