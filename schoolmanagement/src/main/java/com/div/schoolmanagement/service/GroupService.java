package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Group;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.inter.GroupServiceInter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class GroupService implements GroupServiceInter {


    @Override
    public String  creatGroup(Group group) {
        Statics.groupList.add(group);
     return "Created";


    }

    @Override
    public Group getGroupById(int id) {
        return  Statics.groupList.stream()
                .filter(group -> group.getId()==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Group> getAllGroup() {
        return  Statics.groupList;
    }

    @Override
    public void deleteGroup(int id) {
        Statics.groupList.removeIf(group -> group .getId()==id);


    }

    @Override
    public Group uptadeGroup(int id, Group newGroup) {
        Group  oldGroup = Statics.groupList.stream()
                .filter(group -> group.getId()==id)
                .findFirst()
                .orElse(null);

        oldGroup.setGroupName(newGroup.getGroupName());
        oldGroup.setStudents(newGroup.getStudents());
        return oldGroup;

    }



    }





//  //  public static Group getGroupById(long id) {
//        return  Statics.groupList.stream()
//                .filter(group -> group.getId()==id)
//                .findFirst()
//                .orElse(null);
//    }
//
//    public String createGroup(Group group) {
//        Statics.groupList.add(group);
//        return "Created";
//    }

