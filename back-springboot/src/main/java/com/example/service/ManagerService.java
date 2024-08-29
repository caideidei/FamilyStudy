package com.example.service;

import com.example.entity.Manager;

import java.util.List;

public interface ManagerService {
    List<Manager> selectAllManagers2();

    int deleteManagerById2(Integer managerId);

    int updateManager(Manager manager);
}
