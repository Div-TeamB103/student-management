package com.div.schoolmanagement.service.inter;

import com.div.schoolmanagement.entity.Group;

import java.util.List;

public interface GroupServiceInter  {

    String creatGroup(Group group);
    Group getGroupById(int id);
    List<Group> getAllGroup();

    void deleteGroup(int id);

    Group uptadeGroup(int id, Group newGroup);
}
