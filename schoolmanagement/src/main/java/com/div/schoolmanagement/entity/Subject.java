package com.div.schoolmanagement.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;


@Getter
@Setter
public class Subject {

    private int id ;
    private String subjectName;

    public Subject( int id, String subjectName) {

        this.id = id;
        this.subjectName = subjectName;

    }
}
