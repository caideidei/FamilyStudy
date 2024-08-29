package com.example.service.impl;

import com.example.entity.Parent;
import com.example.mapper.ParentMapper;
import com.example.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ParentServiceImpl implements ParentService {

    @Resource
    private ParentMapper parentMapper;

    @Override
    public List<Parent> selectAllParents2() {
        return parentMapper.selectAllParents1();
    }

    @Override
    public int deleteById2(Integer parentId) {
        return parentMapper.deleteById1(parentId);
    }

    @Override
    public int updateParent2(Parent parent) {
        return parentMapper.updateParent1(parent);
    }
}
