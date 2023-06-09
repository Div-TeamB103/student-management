package com.div.schoolmanagement.controller;

import com.div.schoolmanagement.entity.Group;
import com.div.schoolmanagement.entity.Teacher;
import com.div.schoolmanagement.info.Statics;
import com.div.schoolmanagement.service.GroupService;
import com.div.schoolmanagement.service.inter.GroupServiceInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {
    @Autowired
    private GroupServiceInter groupServiceInter;

    @PostMapping()
    public String createGroup(@RequestBody Group group) {
        groupServiceInter.creatGroup(group);
        return "Created";


    }

    @GetMapping("/{id}")
    public Group getGroupById(@PathVariable int id) {
        return groupServiceInter.getGroupById(id);


    }

    @GetMapping()
    public List<Group> getAllGroup() {
        return groupServiceInter.getAllGroup();
//        return  Statics.groupList;

    }

    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable("id") int id) {
        groupServiceInter.deleteGroup(id);

    }


    @PutMapping("/{id}")
    public Group updateGroup(@PathVariable("id") int id, @RequestBody Group newGroup) {

        return groupServiceInter.uptadeGroup(id, newGroup);
//      Group  oldGroup = Statics.groupList.stream()
//                .filter(group -> group.getId()==id)
//                .findFirst()
//                .orElse(null);
//
//        oldGroup.setGroupName(newGroup.getGroupName());
//        oldGroup.setStudents(newGroup.getStudents());
//        return oldGroup;
//


    }


}












