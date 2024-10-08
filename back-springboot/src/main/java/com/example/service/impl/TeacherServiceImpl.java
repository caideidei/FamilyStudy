package com.example.service.impl;

import com.example.entity.Teacher;
import com.example.mapper.TeacherMapper;
import com.example.service.TeacherService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherMapper teacherMapper;

    @Override
    public List<Teacher> selectAllTeachers2() {
        List<Teacher> teachers = teacherMapper.selectAllTeachers1();
        return teachers;
    }

    @Override
    public int deleteById2(Integer teacherId) {
        int i = teacherMapper.deleteById1(teacherId);
        return i;
    }

    @Override
    public int updateTeacher2(Teacher teacher) {
        int i = teacherMapper.updateTeacher1(teacher);
        return i;
    }
}
