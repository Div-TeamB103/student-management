package com.div.schoolmanagement.service;

import com.div.schoolmanagement.entity.Group;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.serviceInter.GroupServiceInter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService implements GroupServiceInter {

    @Override
    public void createGroup(Group group) {
        Statics.groupList.add(group);

    }

    @Override
    public void updateGroupById(Group group, int id) {
    Group oldGroup=Statics.groupList.stream()
            .filter(group1 -> group1.getId()==id).findFirst().orElse(null);
              if(oldGroup!=null){
                  oldGroup.setGroupName(group.getGroupName());
                  oldGroup.setStudents(group.getStudents());
              }
    }

    @Override
    public List<Group> readAll() {
        return Statics.groupList;
    }

    @Override
    public void deleteGroup(int id) {
        Statics.groupList.removeIf(group -> group.getId()==id);

    }

    @Override
    public Group getById(int id) {
        return Statics.groupList.stream().filter(group -> group.getId()==id)
                .findFirst().orElse(null) ;
    }
}
