package com.example.service;

import com.example.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> selectAllTeachers2();

    int deleteById2(Integer teacherId);

}
