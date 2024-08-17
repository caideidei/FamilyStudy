package com.example.mapper;

import com.example.entity.Teacher;

import java.util.List;

public interface TeacherMapper {

    //搜索所有老师信息（传给主页面）
    List<Teacher> selectAllTeachers1();

    int deleteById1(Integer teacherId);

}
