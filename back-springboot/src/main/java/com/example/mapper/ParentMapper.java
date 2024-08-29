package com.example.mapper;

import com.example.entity.Parent;

import java.util.List;

public interface ParentMapper {
    // 查询所有家长信息
    List<Parent> selectAllParents1();
    // 根据ID删除家长信息
    int deleteById1(Integer parentId);
    // 更新家长信息
    int updateParent1(Parent parent);
}
