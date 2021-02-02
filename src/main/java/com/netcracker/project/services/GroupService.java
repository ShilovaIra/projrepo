package com.netcracker.project.services;


import com.netcracker.project.models.Group;

import java.util.List;

public interface GroupService {

    Group addGroup(Group group);
    void delete(Long id);
    Object getById(Long id);
    Group getByName(String name);
    List<Group> getAll();

}
