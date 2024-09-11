package com.example.service.impl;

import com.example.entity.Manager;
import com.example.mapper.ManagerMapper;
import com.example.service.ManagerService;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
//import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Resource
    private ManagerMapper managerMapper;

    @Override
    public List<Manager> selectAllManagers2() {
        List<Manager> managers = managerMapper.selectAllManagers1();
        return managers;
    }

    @Override
    public int deleteManagerById2(Integer managerId) {
        int i = managerMapper.deleteManagerById1(managerId);
        return i;
    }

    @Override
    public int updateManager(Manager manager) {
        int i = managerMapper.updateManager1(manager);
        return i;
    }
}
