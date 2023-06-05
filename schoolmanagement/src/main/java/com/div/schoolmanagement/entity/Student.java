package com.div.schoolmanagement.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Student   {

    private String name ;
    private String surname ;

    private int age ;
    private int id ;
    private String className;

}
