package com.example.service;

import com.example.entity.Parent;

import java.util.List;

public interface ParentService {
    List<Parent> selectAllParents2();

    int deleteById2(Integer parentId);

    int updateParent2(Parent parent);
}
