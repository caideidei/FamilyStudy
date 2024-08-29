package com.example.mapper;

import com.example.entity.Manager;

import java.util.List;

public interface ManagerMapper {
    List<Manager> selectAllManagers1();

    int deleteManagerById1(Integer managerId);

    int updateManager1(Manager manager);
}
