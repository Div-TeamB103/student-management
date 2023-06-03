package com.div.schoolmanagement.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter

public class Group {
    private int id ;
    private String groupName;
    private List<Student> students ;






}
