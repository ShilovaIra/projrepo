package com.netcracker.project.services.impl;

import com.netcracker.project.models.Group;
import com.netcracker.project.repositories.GroupRepository;
import com.netcracker.project.services.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group addGroup(Group group) {
        Group savedGroup = groupRepository.saveAndFlush(group);
        return savedGroup;
    }

    @Override
    public void delete(Long id) {
        groupRepository.deleteById(id);
    }

    @Override
    public Object getById(Long id) {
        return groupRepository.findById(id);
    }

    @Override
    public Group getByName(String name) {
        return groupRepository.findByName(name);
    }

    @Override
    public List<Group> getAll() {
        return groupRepository.findAll();
    }
}
